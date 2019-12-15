package com.software.gameforum.utils;

public class StringUtils {
    public static boolean isEmpty(String string) {
        return string == null || string.trim().equals("");
    }
}
