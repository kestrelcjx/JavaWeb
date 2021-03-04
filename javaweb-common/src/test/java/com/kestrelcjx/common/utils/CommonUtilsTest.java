package com.kestrelcjx.common.utils;

import org.junit.Test;

public class CommonUtilsTest {
    @Test
    public void testStripHtml() {
        assert "HelloWorld".equals(CommonUtils.stripHtml("<html><body>HelloWorld</body></html>"));
    }
}
