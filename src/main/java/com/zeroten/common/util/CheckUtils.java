package com.zeroten.common.util;

public class CheckUtils {
    public static boolean isAnyEmpty(String[] strings){
        for(String str: strings) {
            if (str.length() == 0 || str == null) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEmpty(Object[] arr){
        return arr == null || arr.length == 0;
    }
    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else {
            return (str1 != null && str1.equals(str2));
        }
    }
    public static boolean equals(Integer n1, Integer n2){
        if(n1 == null || n2 == null){
            return false;
        }else{
            return(n1 != null && n1.equals(n2));
        }
    }
}
