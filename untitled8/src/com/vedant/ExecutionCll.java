package com.vedant;

public class ExecutionCll {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(3);
        list.insert(2);
        list.insert(8);
        list.insert(17);
        list.delete(17);

        list.displayCll();
    }
}
