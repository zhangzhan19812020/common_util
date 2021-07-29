package com.gupaoedu.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Pattern;

public class StringHelper {

    /**
     * 判断指定字符串是否为空
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.length() <= 0;
    }

    /**
     * 将指定字符串精选URL编码
     * code 的取值可以为 "UTF-8"、"GBK"、ISO-8859-1"、"GB2312"
     * @param str
     * @param code
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String urlEncode(String str, String code) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, code);
    }

    /**
     * 将指定字符串精选URL解码
     * code 的取值可以为 "UTF-8"、"GBK"、ISO-8859-1"、"GB2312"
     * @param str
     * @param code
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String urlDecode(String str, String code) throws UnsupportedEncodingException {
        return Pattern.compile("\\p{Cntrl}").matcher(URLDecoder.decode(str, code)).replaceAll("");
    }

    /**
     * 获取路径中的文件名
     * @param path
     * @return
     */
    public static String getFileName(String path) {
        String fileName = path.trim();
        fileName = fileName.substring(fileName.lastIndexOf("/")+1);
        fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
        return fileName;
    }

    /**
     * 获取指定文件的扩展名
     * @param fileName
     * @return
     */
    public static String getFileExtensionName(String fileName) {
        String fileExtensionName = fileName.trim();
        fileExtensionName = fileExtensionName.substring(fileExtensionName.lastIndexOf(".")+1);
        return fileExtensionName;
    }

}
