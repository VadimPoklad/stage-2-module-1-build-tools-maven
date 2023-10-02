package com.epam.demo;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UtilsTest {

    @Test
    public void positiveNumberList(){
        List<String> numbers = new ArrayList<>(List.of(new String[]{"12", "16", "76", "56"}));

        boolean expected = true;
        boolean answer = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected,answer);
    }

    @Test
    public void negativeNumberList(){
        List<String> numbers = new ArrayList<>(List.of(new String[]{"-12", "-16", "-76", "-56"}));

        boolean expected = false;
        boolean answer = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected,answer);
    }

    @Test
    public void notNumberList(){
        List<String> numbers = new ArrayList<>(List.of(new String[]{"qwe", "asd", "-zxc", "-rty"}));

        boolean expected = false;
        boolean answer = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected,answer);
    }
  
}