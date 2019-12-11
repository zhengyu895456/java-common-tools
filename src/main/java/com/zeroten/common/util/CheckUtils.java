package com.zeroten.common.util;

public class CheckUtils {
    public static boolean isAnyEmpty(String[] strings){
        for(int i = 0; i < strings.length; i++) {
            if (strings[i] == "" || strings[i] == null) {
                return false;
            }
        }
        return true;
    }
}
