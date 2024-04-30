public class no4 {
    public static void main(String[] args) {
            grade(89,79,98,99,96);
    }
    static void grade(int a , int b ,int c ,int d ,int e){
        int sum = (a+b+c+d+e) / 5;
        System.out.println("The marks of the Student is : " + sum);
        if(sum >= 90){
            System.out.println("The Grade of Student is : Ex");
        }else if( 90 > sum && sum >= 80 ){
            System.out.println("The Grade of Student is : A");
        }else if( 80 > sum && sum >= 70  ){
            System.out.println("The Grade of Student is : B");
        }else if( 70 > sum && sum >= 60 ){
            System.out.println("The Grade of Student is : C");
        }else if(60 > sum ){
            System.out.println("The Grade of Student is : F");
        }
    }  // no 4
}
