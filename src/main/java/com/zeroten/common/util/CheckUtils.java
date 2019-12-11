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
}
