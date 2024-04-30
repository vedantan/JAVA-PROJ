import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       mult(1,2,3,4,5,6,7,8);
       multiple(1,'c',1,2,3);
    }
    static void mult( int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , char b , int ...v   ){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));

    }
}
