import java.util.Scanner;

public class no12 {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        rev(sc);
    }

    static void rev(String sc){
        String result = "" ;
        for (int i = sc.length() -1 ; i >= 0 ; i--) {
            result =  result + sc.charAt(i);
        }

            System.out.println(result);
    }
}
