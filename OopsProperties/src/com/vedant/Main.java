package com.vedant;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box(14,12,29);
        Box box3 = new Box(24);
        BoxWeight box4 = new BoxWeight();
        BoxWeight box5 = new BoxWeight(4,5,6,7);

        System.out.println(box.h + " " + box.l);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);
        System.out.println(box4.l + " " + box4.h + "  " + box4.w);
        System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.weight);
    }
}
