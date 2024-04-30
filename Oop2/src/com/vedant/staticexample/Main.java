package com.vedant.staticexample;

public class Main {
    public static void main(String[] args) {
        Human  kunal = new Human(18 , "kunal kushawa" , 10000, true );
        Human vedant = new Human(21 ,"vedant Nillawar" , 20000 , false);


        System.out.println(kunal.name);
        System.out.println(vedant.name);
        System.out.println(Human.population);
        System.out.println(Human.population);

    }
}
