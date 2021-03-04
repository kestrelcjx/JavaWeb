package com.kestrelcjx.common.utils;

import org.junit.Test;

public class ConvertUtilTest {
    @Test
    public void testSBC() {
        assert "｀～＠＃＄％＾＆＊（）＿＋［］｛｝＼｜；＇：＂＜＞，．？／"
                .equals(ConvertUtil.toSBC("`~@#$%^&*()_+[]{}\\|;':\"<>,.?/"));
    }

    @Test
    public void testDBC() {
        assert "`~@#$%^&*()_+[]{}\\|;':\"<>,.?/"
                .equals(ConvertUtil.toDBC("｀～＠＃＄％＾＆＊（）＿＋［］｛｝＼｜；＇：＂＜＞，．？／"));
    }

    @Test
    public void testDigitUppercase() {
        assert "零元整".equals(ConvertUtil.digitUppercase(0));
        assert "零元整".equals(ConvertUtil.digitUppercase(0.00));
        assert "壹分".equals(ConvertUtil.digitUppercase(0.01));
        assert "贰角".equals(ConvertUtil.digitUppercase(0.20));
        assert "叁角肆分".equals(ConvertUtil.digitUppercase(0.34));
        assert "伍元陆角柒分".equals(ConvertUtil.digitUppercase(5.67));
        assert "捌佰玖拾元整".equals(ConvertUtil.digitUppercase(890));
        assert "壹亿零叁佰零叁万零叁佰伍拾肆元整".equals(ConvertUtil.digitUppercase(103030354.00));
        assert "肆亿贰仟叁佰伍拾万零叁佰贰拾肆元玖角叁分".equals(ConvertUtil.digitUppercase(423500324.93));
        assert "壹亿元整".equals(ConvertUtil.digitUppercase(100000000.00));
        assert "壹仟万壹仟元整".equals(ConvertUtil.digitUppercase(10001000.00));
        assert "负壹仟万壹仟元整".equals(ConvertUtil.digitUppercase(-10001000.00));
        assert "负玖角捌分".equals(ConvertUtil.digitUppercase(-0.98));
    }
}
