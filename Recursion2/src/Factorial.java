
// here return type is present then sout must be present
public class Factorial {
    public static void main(String[] args) {

        System.out.println(fun(15));
        fact(15);
    }
    static int fun(int n){

        if(n<=1){
            return 1;
        }
        return n*fun(n-1);
    }

    static void fact(int n){
        int ans =1;
        if(n >= 1){
          for (int i=n ; i>=1 ; i--){
            ans = ans*i;
          }
        }
        System.out.println(ans);
    }
}
