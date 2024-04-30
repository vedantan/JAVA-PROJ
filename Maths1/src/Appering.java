
//print number appering once

public class Appering {
    public static void main(String[] args) {
      int[] arr ={1,2,3,4,5,4,2,3,1};
        System.out.println(search(arr));

    }
    static int search(int[] arr){
         int ans = 0;
          for(int n : arr){
              ans = ans^n ;

          }
          return ans;
    }

}
