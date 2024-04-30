import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);


//      for specific numbers
        maxno(3,4,5);
    }

    static void maxno(int a , int b , int c){
        System.out.print("greater no is : ");
        if(a > b && a>c){
            System.out.println(a);
        } else if(b>a && b>c){
            System.out.println( b);
        }else{
            System.out.println( c);

        }
    }
}
