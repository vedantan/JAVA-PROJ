package com.vedant;
class Student3{
    int rollno;
    String name;
    float marks;

    Student3(int rono , String naam , float mark) {
        this.rollno = rono;
        this.name = naam;
        this.marks = mark;
    }

    Student3 (){
        this.rollno =32;
        this.name ="kunal";
        this.marks = 99.9f;
    }

//    Student3(Student3 other){
//        this.rollno = other.rollno;
//        this.name = other.name;
//        this.marks = other.marks;
//    }
}
public class AssigningValueUsingConstructor2 {
    public static void main(String[] args) {
        int[] rollno = new int[5];
        String[] name = new String [5];
        float[] marks = new float[5];
        Student3[] students = new Student3[5];

        Student3 vedant = new Student3(42,"vedant nillawar" , 89.9f);

        System.out.println(vedant.rollno);
        System.out.println(vedant.name);
        System.out.println(vedant.marks);

        Student3 rahul = new Student3();
        System.out.println(rahul.rollno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);



//        Student3 random = new Student3( rahul);
//        System.out.println(random.rollno);
//        System.out.println(random.name);
//        System.out.println(random.marks);

    }
}
