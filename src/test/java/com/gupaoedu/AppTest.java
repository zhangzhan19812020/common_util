package com.gupaoedu;

import com.gupaoedu.util.StringHelper;
import org.junit.Test;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class AppTest {

    @Test
    public void isNullOrEmptyTest() {
        System.out.println(StringHelper.isNullOrEmpty(null));
        System.out.println(StringHelper.isNullOrEmpty(""));
        System.out.println(StringHelper.isNullOrEmpty("xx00"));
    }
    @Test
    public void urlEncodeTest() throws UnsupportedEncodingException {
        System.out.println(StringHelper.urlEncode("张展","UTF-8"));
    }

    @Test
    public void urlDecodeTest() throws UnsupportedEncodingException {
        System.out.println(StringHelper.urlDecode("%E5%BC%A0%E5%B1%95","UTF-8"));
    }

    @Test
    public void calendarGetTest() {
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
        System.out.println(Calendar.getInstance().get(Calendar.MONTH) + 1);
        System.out.println(Calendar.getInstance().get(Calendar.DATE));
        System.out.println(Calendar.getInstance().get(Calendar.HOUR));
        System.out.println(Calendar.getInstance().get(Calendar.MINUTE));
        System.out.println(Calendar.getInstance().get(Calendar.SECOND));
        System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND));

    }

    @Test
    public  void getFileNameTest() {
        String path1 =" G:\\Java_Source\\navigation_tigra_menu\\demo1\\img\\lev1_arrow.gif ";
        String path2 =" G:/Java_Source/navigation_tigra_menu/demo1/img/lev2_arrow.gif ";
        System.out.println(StringHelper.getFileName(path1));
        System.out.println(StringHelper.getFileName(path2));

    }

    @Test
    public  void getFileExtensionNameTest() {
        String path =" G:\\Java_Source\\navigation_tigra_menu\\demo1\\img\\lev1_arrow.gif ";
        System.out.println(StringHelper.getFileExtensionName(path));


    }

}
