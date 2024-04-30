public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //base condition
        if( n == 5){
            System.out.println(5);
            return;
        }

        System.out.println(n);

        //recursive call
        //tail recursion because this is last function call
        print(n+1);

    }
}
