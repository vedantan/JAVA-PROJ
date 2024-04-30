package com.vedant;

public class Execution {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.insertatlast(99);
        list.insertn(100,3);


        list.display();





        System.out.println();
        System.out.println(list.deletefirst());
        list.display();

        System.out.println();


        System.out.println(list.deletelast());
        list.display();

        list.find(2);




        System.out.println();
        System.out.println(list.deleten(2));
        list.display();

    }
}
