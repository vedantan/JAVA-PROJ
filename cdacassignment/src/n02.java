public class n02 {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(fact2(4));
    }

    //  by using for loop
    static int fact(int n){
        int res = 1;
        for (int i = n; i >=1 ; i--) {
            res = res*i;
        }
        return res;
    }


    // by using recursiom
    static int fact2(int n){
        if(n <=1){
            return 1;
        }
        return n * fact2(n-1);
    }
}
