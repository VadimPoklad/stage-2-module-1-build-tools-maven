package com.epam.utils;



public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
            return (d>=0);
        }catch (NumberFormatException e){
            return false;
        }

    }
}
