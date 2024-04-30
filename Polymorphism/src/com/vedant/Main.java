package com.vedant;
// Act of representing some thing in multiple ways
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle cir = new Circle();
        Shapes tri = new Triangle();

        Circle.area();
        Shapes.area();
        Triangle.area();
    }


}
