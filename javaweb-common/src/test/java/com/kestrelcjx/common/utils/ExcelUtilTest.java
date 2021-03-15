package com.kestrelcjx.common.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExcelUtilTest {
    @Test
    public void testReadLessThan1000Row() {
        List<Object> list = ExcelUtil.readLessThan1000Row(
                "C:\\Users\\Administrator\\Desktop\\" +
                        "JavaWeb\\javaweb-common\\src\\test\\resources\\excel.xlsx");
        for (Object o : list) {
            System.out.println(o);
        }
    }

    @Test
    public void testReadMoreThan1000Row() {
        List<Object> list = ExcelUtil.readLessThan1000Row(
                "C:\\Users\\Administrator\\Desktop\\" +
                        "JavaWeb\\javaweb-common\\src\\test\\resources\\excels.xlsx");
        int count = 0;
        for (Object o : list) {
            System.out.println(o);
            if(++count >= 10) {
                break;
            }
        }
    }

    @Test
    public void testWriteBySimple() {
        List<List<Object>> data = new ArrayList<>();
        List<String> head = new ArrayList<>();
        head.add("壹");
        head.add("贰");
        head.add("叁");
        List<Object> item = new ArrayList<>();
        item.add("1");
        item.add("2");
        item.add("3");
        data.add(item);
        ExcelUtil.writeBySimple("C:\\Users\\Administrator\\Desktop\\" +
                "JavaWeb\\javaweb-common\\src\\test\\resources\\export.xlsx", data, head);
    }
}
