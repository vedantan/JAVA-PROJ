import java.util.Scanner;

public class Prime1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();
        find(ip);
    }
    static void find(int ip){
        for(int i = 2; i<=ip;){
            if(i == ip){
                System.out.println("Prime");
                break;
            }else if(ip % i == 0){
                System.out.println("Is not Prime");
                break;
            }else{
                i++;
            }
        }
    }
}
