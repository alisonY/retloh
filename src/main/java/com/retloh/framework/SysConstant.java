package com.retloh.framework;

/**
 * 系统常量类
 */
public class SysConstant {

	/** 系统 文件分隔符 */
	public static final String FILE_STEP = System.getProperty("file.separator");
	/** 生成文件的临时目录: "/tmp" */
	public static final String FILE_TMP_FOLDER = FILE_STEP + "data" + FILE_STEP;
	/** 日志文件目录 */
	public static final String LOGGER_FOLDER = FILE_STEP + "opt" + FILE_STEP;
}
