package com.vedant.staticexample;

// this is a demo to initilize static variable

public class StaticBlock {
    static  int a =4;
    static int b ;

//    in static block we should use class name  eg-line no 18 StaticBlock.a

    static {
        System.out.println("I am a static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " +StaticBlock.b);

    }

}
