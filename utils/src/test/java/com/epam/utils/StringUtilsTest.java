package com.epam.utils;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {
    @Test
    public void positiveNumber(){
        String num = "123";
        boolean expected = true;
        boolean answer = StringUtils.isPositiveNumber(num);
        assertEquals(expected,answer);
    }

    @Test
    public void negativeNumber(){
        String num = "-123";
        boolean expected = false;
        boolean answer = StringUtils.isPositiveNumber(num);
        assertEquals(expected,answer);
    }

    @Test
    public void notNumber(){
        String num = "-qwe";
        boolean expected = false;
        boolean answer = StringUtils.isPositiveNumber(num);
        assertEquals(expected,answer);
    }
    @Test
    public void zeroNumber(){
        String num = "0";
        boolean expected = true;
        boolean answer = StringUtils.isPositiveNumber(num);
        assertEquals(expected,answer);
    }

    @Test
    public void minusZeroNumber(){
        String num = "-qasd";
        boolean expected = false;
        boolean answer = StringUtils.isPositiveNumber(num);
        assertEquals(expected,answer);
    }

}