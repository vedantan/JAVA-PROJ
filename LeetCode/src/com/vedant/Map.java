package com.vedant;

    public class Map {

        static String city = "XYZ";
        String village = "PQR";

        Map(String city , String village){
            Map.city = city;
            village = village;

        }
        void displayNames (){

            System.out.println(city + "  " + village);
        }

        public static void main(String[] args) {
            Map map_1 = new Map ("ABC" , "JKL");
            Map map_2 = map_1;
            map_2.displayNames();
        }


    }

