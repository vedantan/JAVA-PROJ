package com.vedant;

public class ExecutationDll {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertAfter(8,65);

        list.Display();
    }
}
