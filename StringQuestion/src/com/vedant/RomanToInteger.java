package com.vedant;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romantointeger("MCMXCIV"));
    }
    static int romantointeger(String s){

        int i=0;
        StringBuilder sb = new StringBuilder(s);

        for(int j=0 ; j<sb.length()-1 ;j++){
            if(sb.charAt(j) == 'I' && sb.charAt(j+1) == 'V'){
                i=i+4;
                sb.delete(j,j+2);
                j--;
            }else if(sb.charAt(j) == 'I' && sb.charAt(j+1) == 'X'){
                i=i+9;
                sb.delete(j,j+2);
                j--;
            }else if(sb.charAt(j) == 'X' && sb.charAt(j+1) == 'L'){
                i=i+40;
                sb.delete(j,j+2);
                j--;
            }else if(sb.charAt(j) == 'X' && sb.charAt(j+1) == 'C'){
                i=i+90;
                sb.delete(j,j+2);
                j--;
            }else if(sb.charAt(j) == 'C' && sb.charAt(j+1) == 'D'){
                i=i+400;
                sb.delete(j,j+2);
                j--;
            }else if(sb.charAt(j) == 'C' && sb.charAt(j+1) == 'M'){
                i=i+900;
                sb.delete(j,j+2);
                j--;
            }
        }





        for(int j=0 ; j<sb.length() ;j++){
            if(sb.charAt(j) == 'I'){
                i=i+1;
            }else if (sb.charAt(j) == 'V'){
                i=i+5;
            }else if (sb.charAt(j) == 'X'){
                i=i+10;
            }else if (sb.charAt(j) == 'L'){
                i=i+50;
            }else if (sb.charAt(j) == 'C'){
                i=i+100;
            }else if (sb.charAt(j) == 'D'){
                i=i+500;
            }else if (sb.charAt(j) == 'M'){
                i=i+1000;
            }
        }
        return i;


//        HashMap<Character,Integer> map=new HashMap<>();
//        map.put('I',1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);
//        int res=map.get(s.charAt(s.length()-1));
//        for(int i=s.length()-2;i>=0;i--){
//            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
//                res-=map.get(s.charAt(i));
//            }else{
//                res+=map.get(s.charAt(i));
//            }
//        }
//        return res;
    }
}
