import java.util.Arrays;

public class Abc {
    public static void main(String[] args) {
        int a[] = {5,3,7};
        m1(a);
        m2(a);
        System.out.println(Arrays.toString(a));


    }
    private static void m1 (int [] number){
        number [2] = number[1];
    }
    private static void m2 (int [] number){
        number [0] = number[1];
    }
}
