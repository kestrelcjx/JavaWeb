package com.kestrelcjx.common.utils;

import org.junit.Test;

import java.util.Date;

public class DateUtilsTest {
    @Test
    public void testParseDateToStr() {
        assert "1970-01-01 08:00:00".equals(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS, new Date(0)));
    }

    @Test
    public void testParseDate() {
        assert DateUtils.parseDate("1970/01/01 08:00:00").getTime() == 0L;
    }
}
