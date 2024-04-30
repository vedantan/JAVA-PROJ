package com.vedant.staticexample;
//outer class can not be static


//class Test{
//    String name;
//    public Test (String name){
//        this.name = name;
//    }
//}

public class InnerClass {
    static class Test{
        String name;
        public Test (String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("vedant");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
