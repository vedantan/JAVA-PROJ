public class Cube {
    public static void main(String[] args) {
        System.out.println(cube(3));
    }

    static int cube(int n){
        int cube =0;
        while(n>0){
            int rem = n%10;
            cube = rem*rem*rem;
            n= n/10;
        }
        return cube;
    }
}
