import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
      int[] arr ={5,3,9,4,1};
      swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr){
        boolean swapped;
        for(int i =0 ; i < arr.length ; i++){
            swapped = false;
            for(int j =1 ; j < arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
}
