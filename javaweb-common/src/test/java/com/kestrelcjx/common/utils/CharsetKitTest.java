package com.kestrelcjx.common.utils;

import org.junit.Test;

public class CharsetKitTest {
    @Test
    public void testCharset() {
        System.out.println(CharsetKit.charset("UTF-8"));
    }

    @Test
    public void testConvert() {
        String str = "Hello World!";
        assert str.equals(CharsetKit.convert(str, CharsetKit.CHARSET_ISO_8859_1, CharsetKit.CHARSET_GBK));
    }

    @Test
    public void testSystemCharset() {
        System.out.println(CharsetKit.systemCharset());
    }
}
