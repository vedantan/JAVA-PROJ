package com.vedant;
class Student1 {
    int rollno;
    String name;
    float marks;

    Student1(){
        this.rollno = 42;
        this.name = "vedant nillawar";
        this.marks = 98.9f;
    }
}
public class AssigningValueUsingConstructor {
    public static void main(String[] args) {
        int[] rollno = new int[5];
        String[] name = new String [5];
        float[] marks = new float[5];
        Student1[] students = new Student1[5];

        Student1 vedant = new Student1();
//

        System.out.println(vedant.rollno);
        System.out.println(vedant.name);
        System.out.println(vedant.marks);
    }
}
