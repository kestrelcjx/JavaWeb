package com.kestrelcjx.common.utils;

import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testSubstring() {
        String str = "HelloWorld";
        assert "World".equals(StringUtils.substring(str, 5));
        assert "oWo".equals(StringUtils.substring(str, 4, 7));
        assert "oWo".equals(StringUtils.substring(str, -6, -3));
    }

    @Test
    public void testToUnderScoreCase() {
        assert "user_name".equals(StringUtils.toUnderScoreCase("UserName"));
    }

    @Test
    public void testConvertToCamelCase() {
        assert "HelloWorld".equals(StringUtils.convertToCamelCase("HELLO_WORLD"));
    }

    @Test
    public void testToCamelCase() {
        assert "userName".equals(StringUtils.toCamelCase("user_name"));
    }
}
