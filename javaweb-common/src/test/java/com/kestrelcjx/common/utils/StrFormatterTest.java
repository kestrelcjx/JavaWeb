package com.kestrelcjx.common.utils;

import org.junit.Test;

public class StrFormatterTest {
    @Test
    public void testFormat() {
        assert "this is a for b".equals(StrFormatter.format("this is {} for {}", "a", "b"));
        assert "this is {} for a".equals(StrFormatter.format("this is \\{} for {}", "a", "b"));
        assert "this is \\a for b".equals(StrFormatter.format("this is \\\\{} for {}", "a", "b"));
        assert "this is {} for {}".equals(StrFormatter.format("this is {} for {}"));
        assert "this is {x} for {x}".equals(StrFormatter.format("this is {x} for {x}", "a", "b"));
    }
}
