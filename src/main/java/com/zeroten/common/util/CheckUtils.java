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
    public static boolean isEmpty(Object[] arr){
        boolean emp = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("") || arr[i].equals(null)){
                emp = true;
            }else{
                emp = false;
            }
        }
        return emp;
    }
    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else {
            return (str1.equals(str2));
        }
    }
    public static boolean equals(Integer n1, Integer n2){
        if(n1 == null || n2 == null){
            return false;
        }else{
            return(n1.equals(n2));
        }
    }
}
