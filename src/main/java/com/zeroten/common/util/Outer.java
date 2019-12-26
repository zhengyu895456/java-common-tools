package com.zeroten.common.util;

public class Outer {
    interface Inter {
        void show();
    }
    public static Inter create(){
        return new InterImpl();
    }
    static class InterImpl implements Inter{
        @Override
        public void show() {
            System.out.println("helloworld");
        }
    }
    public static void main(String[] args) {
        Outer.create().show();
    }
}
