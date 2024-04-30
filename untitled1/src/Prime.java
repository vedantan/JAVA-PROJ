import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean[] arr = find(21);

        for(int i =0 ; i<=21 ; i++){
            System.out.println(i+" " +arr[i]);
        }


    }
    static boolean[] find(int n){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]= false;
        arr[1] = false;

       for(int i =2 ; i*i <= n ;i++){
           for(int j = 2*i ; j<=n ; j= j+i){
               arr[j] = false;
           }
       }

        return arr;

    }
}
