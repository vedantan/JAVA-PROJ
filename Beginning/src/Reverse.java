public class Reverse {
    public static void main(String[] args) {
//        int a = 597247;
//
//        while(a > 0){
//            int rem = a%10;
//            System.out.print(rem + " ");
//
//            a=a/10;
//        }

        int b = 12345;
        int ans = 0;
        while(b>0){
            int rem = b%10;
            ans = ans*10 + rem;
            b= b/10;

        }
        System.out.println(ans);

    }



}
