package com.retloh.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.retloh.controller.CaseInfoController;

/**
 * 文件操作.
 */
public class FileUtil {

    private static final Logger LOGGER     = LoggerFactory.getLogger(FileUtil.class);

    private static final int K=1024;
    public FileUtil() {
    }

    /**
     * 新建目录.
     * 
     * @param folderPath
     */
    public static void creatFolder(String path) {
        boolean flag = false;
        String filePath = path;
        File myFilePath = new File(filePath);
        if (!myFilePath.exists()) {
            flag = myFilePath.mkdirs();
        }
        LOGGER.info(path + "creatFolder " + flag);
    }

    /**
     * 创建CSV 文件
     * 
     * @param fileContent 文件内容字符串
     * @param fileName 文件名称 包含路径
     */
    public static void createCSVFile(String fileContent, String fileName) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "GBK"));
            // 添加新的数据行
            bw.write(fileContent);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
    }

    /**
     * 将指定目录的文件 放入输出流中.
     * 
     * @param outputStream 输出流
     * @param filePath 文件路径
     */
    public static void fileToStream(OutputStream outputStream, String filePath) {
        LOGGER.info("fileToStream start ");

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(filePath));
            bos = new BufferedOutputStream(outputStream);

            byte[] buff = new byte[1024];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
            bis.close();
            bos.close();
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
        LOGGER.info("fileToStream end ");
    }


    /**
     * 删除文件 ,避免 文件堆积.
     * 
     * @param fileName
     */
    public static void deleteFile(String fileName) {
        File myFile = new File(fileName);
        boolean flag = false;
        if (myFile.exists()) {
            flag = myFile.delete();
        }
        LOGGER.info(fileName + " delete " + flag);
    }
}
