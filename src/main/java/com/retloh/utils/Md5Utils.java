package com.retloh.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

public class Md5Utils {
	private static final Logger LOGGER = LoggerFactory.getLogger(Md5Utils.class);
	private static char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	private Md5Utils() {

	}

	/***
	 * 
	 * @param fileName
	 * @param hashType
	 *            "MD5"
	 * @return
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */

	public static String getHash(String fileName, String hashType) throws NoSuchAlgorithmException {

		try {
			long start = System.currentTimeMillis();

			File f = new File(fileName);
			InputStream ins = new FileInputStream(f);

			byte[] buffer = new byte[8192];
			MessageDigest md5 = MessageDigest.getInstance(hashType);

			int len;
			while ((len = ins.read(buffer)) != -1) {
				md5.update(buffer, 0, len);
			}

			ins.close();
			long end = System.currentTimeMillis();
			LOGGER.debug("计算 {} md5sum 一共耗时:" + (end - start) + "毫秒", fileName);

			return toHexString(md5.digest());

		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			LOGGER.error("get {} file md5sum error!", fileName);
			return "";
		}

	}

	protected static String toHexString(byte[] b) {
		StringBuilder sb = new StringBuilder(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			sb.append(hexChar[(b[i] & 0xf0) >>> 4]);
			sb.append(hexChar[b[i] & 0x0f]);
		}
		return sb.toString();
	}

	/*
	 * 获取MessageDigest支持几种加密算法
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static String[] getCryptolmpls(String serviceType) {

		Set result = new HashSet();
		// all providers
		Provider[] providers = Security.getProviders();
		for (int i = 0; i < providers.length; i++) {
			// get services provided by each provider
			Set keys = providers[i].keySet();
			for (Iterator it = keys.iterator(); it.hasNext();) {
				String key = it.next().toString();
				key = key.split(" ")[0];

				if (key.startsWith(serviceType + ".")) {
					result.add(key.substring(serviceType.length() + 1));
				} else if (key.startsWith("Alg.Alias." + serviceType + ".")) {
					result.add(key.substring(serviceType.length() + 11));
				}
			}
		}
		return (String[]) result.toArray(new String[result.size()]);
	}

	public static void main(String[] args) throws Exception, Exception {
		// 调用方法
		// String[] names = getCryptolmpls("MessageDigest");
		// for(String name:names){
		// System.out.println(name);
		// }
		System.out.println("===========os.name:" + System.getProperties().getProperty("os.name"));
		long start = System.currentTimeMillis();
		System.out.println("开始计算文件MD5值,请稍后...");
		String fileName = "D:/holter_test.tar";
		//// String fileName = "E:\\SoTowerStudio-3.1.0.exe";
		String hashType = "MD5";
		String hash = getHash(fileName, hashType);
		System.out.println("MD5:" + hash);
		long end = System.currentTimeMillis();
		System.out.println("一共耗时:" + (end - start) + "毫秒");
	}
}
