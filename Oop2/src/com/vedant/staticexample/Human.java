package com.vedant.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
//    long population;
    static long population;

    static void message(){
        System.out.println("hello vedant");
//        we can not use this keyword in static method
    }


    public Human(int age , String name , int salary , boolean married){
        this.age =age;
        this.name= name;
        this.salary = salary;
        this.married = married;
//        this.population += 1;
        Human.population += 1;

        Human.message();

    }
}
