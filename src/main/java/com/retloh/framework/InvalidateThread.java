package com.retloh.framework;

public class InvalidateThread extends Thread
{
    private String key;
    public InvalidateThread(String key)
    {
        this.key = key;
    }
    public void run()
    {
    	LocalCacheUtil.getInstance().delLocalCache(key);
    }
    
    public static void main(String[] args)
    {
        Thread thread = new InvalidateThread("world");
        thread.start();       
    }
}
