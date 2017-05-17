package com.retloh.framework.cache;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.google.common.cache.CacheStats;

/**
 * 本地缓存通用接口
 */
public class LocalCacheUtil {
	
	private static LocalCacheUtil localCacheUtil;
	
	private LocalCacheUtil(){};
	
	public static LocalCacheUtil getInstance(){
		if(localCacheUtil == null){
			localCacheUtil = new LocalCacheUtil();
		}
		return localCacheUtil;
	} 
	
	/**
	 * 根据key获取本地缓存值——对象类型
	 * @param key
	 * @return
	 */
    public Object getLocalCache(String key) {
    	if(this.getRemainTime(key)<0){
            Thread thread = new InvalidateThread(key);
            thread.start();      
    		return null;
    	}
    	Object[] obj = (Object[])LocalCache.getInstance().getIfPresent(key);
    	if(obj!=null && obj.length>0){
    		return obj[0];
    	}
    	return null;
    }
      
    /**
     * 根据key获取本地缓存值——String类型
     * @param key
     * @return
     */
    public String getLocalCacheForString(String key){
    	if(this.getRemainTime(key)<0){
            Thread thread = new InvalidateThread(key);
            thread.start();      
    		return null;
    	}
    	Object obj_value = this.getLocalCache(key);
    	if(null!=obj_value){
    		return JSON.toJSONString(obj_value);
    	}
    	return null;
    }
    
    
    /**
     * 获取本地缓存创建时间——Date类型
     * @param key
     * @return
     */
    public Date getCreateTime(String key){
    	Object[] obj = (Object[])LocalCache.getInstance().getIfPresent(key);
    	if(obj!=null && obj.length>0){
    		return (Date)obj[1];
    	}
    	return null;
    }
    
    /**
     * 获取本地缓存创建时间——String类型
     * @param key
     * @return
     */
    public String getCreateTimeForString(String key){
    	Date date_createTime= this.getCreateTime(key);
    	if(null!=date_createTime){
    		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	return sdf.format(date_createTime);
    	}
    	return null;
    }
    
    /**
     * 获取设置的本地缓存失效时间
     * @param key
     * @return
     */
    public long getLocalExpiration(String key){
    	Object[] obj = (Object[])LocalCache.getInstance().getIfPresent(key);
    	if(obj!=null && obj.length>0){
    		return Long.parseLong(obj[2].toString());
    	}
    	return -1;
    }
    
    /**
     * 存放本地缓存
     * @param key
     * @param value
     * @param localExpiration
     */
    public void putLocalCache(String key,Object value,Date createTime,long localExpiration){
    	Object[] object = new Object[3];
    	object[0] = value; 
    	object[1] = createTime;
    	object[2] = localExpiration;
    	LocalCache.getInstance().put(key, object);
    }
    
    /**
     * 存放本地缓存
     * @param key
     * @param value
     * @param localExpiration
     */
    public void putLocalCache(String key,Object value,long localExpiration){
    	Object[] object = new Object[3];
    	object[0] = value; 
    	object[1] = new Date();
    	object[2] = localExpiration;
    	LocalCache.getInstance().put(key, object);
    }
    
    /**
     * 根据key清除本地缓存
     * @param key
     */
    public void delLocalCache(String key){
    	LocalCache.getInstance().invalidate(key);
    }
    
    
    /**
     * 批量清除本地缓存(字符串数组)
     * @param keys
     */
    public void delManyLocalCache(String[] keys){
    	final String[] fkeys = keys;
		LocalCache.getInstance().invalidateAll(new Iterable<String>() {
		      @Override 
		      public Iterator<String> iterator() {
		    	  List<String> lst = Arrays.asList(fkeys);
		          return lst.iterator();
		      }
        });
    }
    
    /**
     * 清除本地所有缓存
     */
    public void delAllLocalCache(){
    	LocalCache.getInstance().invalidateAll();
    }

    /**
     * 重新构建本地缓存对象
     * @param maximumSize
     */
    public void createLocalCache(long maximumSize){
    	new LocalCache(maximumSize);
    }
    
    /**
     * 设置本地缓存失效时间
     * @param key
     * @param localExpiration
     */
    public void updateLocalExpiration(String key,long localExpiration){
    	Object[] obj = (Object[])LocalCache.getInstance().getIfPresent(key);
    	if(obj!=null && obj.length>0){
    		this.putLocalCache(key, obj[0], (Date)obj[1], localExpiration);
    	}
    }
    
    
    /**
     * 获取本地缓存剩余时间
     * @param key
     * @return 毫秒
     */
    public long getRemainTime(String key){
    	Date createTimeObj = this.getCreateTime(key);
    	if(createTimeObj !=null){
        	long createTime = createTimeObj.getTime();
        	long localExpiration = this.getLocalExpiration(key);
        	long nowTime = new Date().getTime();
        	long cTime = createTime + localExpiration*1000 - nowTime;
        	if(cTime>=0){
        		return cTime;
        	}
    	}
    	return -1;
    }
    
    /**
     * 获取本地缓存中key数量
     * @return
     */
    public long getKeysSize(){
    	Set<String> keys = LocalCache.getInstance().asMap().keySet();
    	if(null!=keys){
    		return keys.size();
    	}
    	return 0;
    }
    
    /**
     * 获得所有缓存的命中统计
     * @return
     */
    public String getCacheStats(){
    	CacheStats stats = LocalCache.getInstance().stats();
		StringBuffer sb = new StringBuffer(200);
		sb.append("[CacheStats]").append("requestCount=").append(stats.requestCount()).append(","); // 返回Cache的lookup方法查找缓存的次数，不论查找的值是否被缓存
		sb.append("hitCount=").append(stats.hitCount()).append(","); //返回Cache的lookup方法命中缓存的次数
		sb.append("hitRate=").append(stats.hitRate()).append(",");//返回缓存请求的命中率，命中次数除以请求次数
		sb.append("missCount=").append(stats.missCount()).append(",");//返回缓存请求的未命中的次数
		sb.append("missRate=").append(stats.missRate()).append(",");//返回缓存请求未命中的比率，未命中次数除以请求次数
		sb.append("evictionCount=").append(stats.evictionCount());//返回缓存中条目被移除的次数
		return sb.toString();
    }
    
	public static void main(String[] args) throws Exception {
		new Thread(new Runnable() {
			@Override
			public void run() {
				LocalCacheUtil localcacheUtil = LocalCacheUtil.getInstance();
				
				try {
					/*
					localcacheUtil.putLocalCache("testKey_1", "private",new Date(),1*60);
					localcacheUtil.putLocalCache("heheDong", "public",new Date(),5*60);
					System.out.println("keys_testKey_1:" + localcacheUtil.getLocalExpiration("testKey_1"));
					System.out.println("keys_heheDong:" + localcacheUtil.getLocalExpiration("heheDong"));
					
					System.out.println("value_testKey_1:" + localcacheUtil.getLocalCache("testKey_1"));
					System.out.println("value_heheDong:" + localcacheUtil.getLocalCache("heheDong"));
					
					localcacheUtil.updateLocalExpiration("testKey_1", 200);
					localcacheUtil.updateLocalExpiration("heheDong", 100);
					System.out.println("LocalExpiration_keys_testKey_1:" + localcacheUtil.getLocalExpiration("testKey_1"));
					System.out.println("LocalExpiration_keys_heheDong:" + localcacheUtil.getLocalExpiration("heheDong"));
					
					System.out.println("value_testKey_1:" + localcacheUtil.getLocalCache("testKey_1"));
					System.out.println("value_heheDong:" + localcacheUtil.getLocalCache("heheDong"));
					
					System.out.println("time_testKey_1:" + localcacheUtil.getRemainTime("testKey_1"));
					System.out.println("time_heheDong:" + localcacheUtil.getRemainTime("heheDong"));
					System.out.println("keysize:" + localcacheUtil.getKeysSize());
					localcacheUtil.delLocalCache("testKey_1");
					System.out.println("keysize:" + localcacheUtil.getKeysSize());
					
					System.out.println("time_heheDong_before:" + localcacheUtil.getRemainTime("heheDong"));
					localcacheUtil.updateLocalExpiration("heheDong", 200);
					System.out.println("time_heheDong_after:" + localcacheUtil.getRemainTime("heheDong"));
					Thread.sleep(3000);
					System.out.println("RemainTime->heheDong:" + localcacheUtil.getRemainTime("heheDong"));
					System.out.println("value_heheDong:" + localcacheUtil.getLocalCache("heheDong"));
					Thread.sleep(4000);
					System.out.println("value_heheDong:" + localcacheUtil.getLocalCache("heheDong"));
					System.out.println("LocalExpiration_keys_heheDong:" + localcacheUtil.getLocalExpiration("heheDong"));
					 */
					
					localcacheUtil.putLocalCache("testKey", "eatMe", new Date(), 1*60);
					System.out.println("取缓存值：" + localcacheUtil.getLocalCache("testKey"));
					System.out.println("取缓存设置的失效时间：" + localcacheUtil.getLocalExpiration("testKey"));
					System.out.println("取缓存失效剩余时间：" + localcacheUtil.getRemainTime("testKey"));
					localcacheUtil.updateLocalExpiration("testKey", 2);
					Thread.sleep(3000);
					System.out.println("修改后取缓存失效剩余时间：" + localcacheUtil.getRemainTime("testKey"));
					Long s = System.currentTimeMillis();
					System.out.println("修改后取缓存值：" + localcacheUtil.getLocalCache("testKey"));
					System.out.println(System.currentTimeMillis()-s);
					System.out.println("修改后取设置的失效时间：" + localcacheUtil.getLocalExpiration("testKey"));
					System.out.println("修改后取缓存失效剩余时间：" + localcacheUtil.getRemainTime("testKey"));
					localcacheUtil.delLocalCache("testKey");
					System.out.println("删除后取缓存值：" + localcacheUtil.getLocalCache("testKey"));
					System.out.println("删除后取设置的失效时间：" + localcacheUtil.getLocalExpiration("testKey"));
					System.out.println("删除后取缓存失效剩余时间：" + localcacheUtil.getRemainTime("testKey"));

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
    
}
