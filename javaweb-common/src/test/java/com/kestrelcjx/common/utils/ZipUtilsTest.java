package com.kestrelcjx.common.utils;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ZipUtilsTest {
    @Test
    public void testZip() {
        try {
            URL zip = ZipUtilsTest.class.getClassLoader().getResource("zip");
            ZipUtils.zip(zip.toString().substring(6), "dest.zip", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        release();
    }

    @Test
    public void testUnzip() {
        URL zip = ZipUtilsTest.class.getClassLoader().getResource("dest.zip");
        ZipUtils.unzip(zip.toString().substring(6), "./");
        release();
    }

    public void release() {
        File file1 = new File("zip");
        File file2 = new File("dest.zip");
        delete(file1);
        delete(file2);
    }

    public void delete(File file) {
        if (null == file) {
            return;
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                delete(f);
            }
            file.delete();
        } else {
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
