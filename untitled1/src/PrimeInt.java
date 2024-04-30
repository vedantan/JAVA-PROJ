import java.util.Scanner;
public class PrimeInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ip = in.nextInt();
        prime(ip);
    }

    static void prime(int ip){
      boolean flag = false;
      for(int i =2 ; i <= ip/2 ;i++){
          if(ip % i == 0){
              flag = true;
              break;
          }
      }
      if(!flag ){
          System.out.println(ip + " " + "is prime");
      }else{
          System.out.println(ip + " " + "is not prime");
      }

    }
}
