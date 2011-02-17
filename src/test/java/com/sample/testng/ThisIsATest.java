package com.sample.testng;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class ThisIsATest {
    @Test
    public void test() {
        Assert.assertEquals("a", "a");
    }
}
