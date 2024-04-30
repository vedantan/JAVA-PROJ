package com.vedant;
// find target element in the string
public class FindTarget {
    public static void main(String[] args) {
        String a = "prepinsta is best website";
        String b = "website";
        String target = "website";
//        System.out.println(find(a,b,target));
        find(a,target);
    }

//    static int find(String a ,String b ,String target){
//        String c = a+ " " +b;
//        System.out.println(c);
//        int count =0;
//        for (int i=0 ; i<c.length() ;i++){
//            if(c.contains(target)){
//                count++;
//            }
//        }
//        return count;
//    }

    static void find(String a , String target){
        String[] b = a.split(" ");
        for (int i=0 ; i<b.length ; i++){
           if(b[i].equals(target)){
               System.out.println(i);

           }
        }
    }
}
