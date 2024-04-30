public class Pyramid {
    public static void main(String[] args) {
        pyramid(5);
    }

     static void pyramid(int n){

        for(int i=0 ; i < n ; i++){
            for(int j =0 ; j < n-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
     }
}
