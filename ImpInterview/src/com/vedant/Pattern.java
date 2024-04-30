package com.vedant;

//https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=5
//https://youtu.be/Dr4PpNa7AYo
public class Pattern {
    public static void main(String[] args) {
        patern1(5);
        System.out.println();
        invertedRotated(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pascal(5);
        System.out.println();
        floyds(5);
        System.out.println();
        floydspry(5);
        System.out.println();
        hallowRectangle(4,5);
        System.out.println();
        ZeroOneTriangle(5);
        System.out.println();
        Butterfly(4);
        System.out.println();
        Rombus(5);
        System.out.println();
        HallowRombus(5);
        System.out.println();
        palindromicpyramid(5);
    }

    static void patern1(int n){
       for(int i=0 ; i<n ; i++){
           for(int j=0 ; j<=i ; j++){
               System.out.print("* ");
           }
           System.out.println( );
       }
    }

    static void invertedRotated(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
       for(int i=0 ; i<=n ; i++){
           for(int j=0 ; j<=n ; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    static void pattern3(int n){
        for (int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=n-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i=n-1 ; i>=0 ; i--){
//            for(int j=0 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

    static void pattern5(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<=i ; j++){
                System.out.print(" ");
            }
            for (int j=n-i ; j>=1 ; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
//inner loop work for space
            for (int j = n - i; j > 1; j--) {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (int j = 0; j <= i; j++) {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=0 ; j<n-i+1 ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int i=1 ; i<=n ;i++){
            for (int j=n-i+1 ; j>1 ;j-- ){
                System.out.print(" ");
            }
            for (int j=0 ; j<i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for (int i=1 ; i<=n ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print(" ");
            }
            for (int j=n-i+1 ; j>=1 ;j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        int spaces = n;
        for (int i=0 ; i<n ;i++){
            for (int j=0 ;j<=spaces ;j++){
                System.out.print(" ");
            }
            for (int j=0 ;j<=i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    static void pascal(int n){
        int spaces = n;
        int number =1;
        for (int i=0 ; i<n ;i++){
            for (int j=0 ; j<=spaces ;j++){
                System.out.print(" ");
            }
            number =1;
            for (int j=0 ;j<=i ;j++){
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            spaces--;
            System.out.println();
        }
    }

    static void floyds(int n){
        int no = 1;
        for(int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(no + " ");
                no++;
            }
            System.out.println();
        }
    }

    static void floydspry(int n){
        int no=1;
        for (int i=1 ; i<=n ;i++){
            for (int j=n-i ; j>=1 ; j--){
                System.out.print(" ");
            }
            for (int j=1 ; j<=i ;j++){
                System.out.print(no + " ");
                no++;
            }
            System.out.println();
        }
    }

    static void hallowRectangle(int n , int m){
        for(int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=m ; j++){
                if(i == 1 || i == n || j==1 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static void ZeroOneTriangle(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void Butterfly(int n){
        for (int i=1 ;i<=n ;i++){
            for (int j=1 ;j<=i ;j++){
                System.out.print("* ");
            }
            for (int j=1 ;j<=((2*n)-(2*i)) ;j++){
                System.out.print("  ");
            }
            for (int j=1 ;j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=n ;i>=1 ;i--){
            for (int j=1 ;j<=i ;j++){
                System.out.print("* ");
            }
            for (int j=1 ;j<=((2*n)-(2*i)) ;j++){
                System.out.print("  ");
            }
            for (int j=1 ;j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void Rombus(int a){
        for (int i=1 ;i<=a ; i++){
            for (int j=1 ; j<=a-i ;j++){
                System.out.print("  ");
            }
            for (int j=1 ;j<=a ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void HallowRombus(int a){
        for (int i=1 ;i<=a ; i++){
            for (int j=1 ; j<=a-i ;j++){
                System.out.print("  ");
            }
            for (int j=1 ;j<=a ; j++){
                if(i==1 || j==1 || i==a || j==a){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void palindromicpyramid(int n){
        for (int i=1 ; i<=n ;i++){
            for (int j=1 ; j<= n-i ; j++){
                System.out.print("  ");
            }
            for (int j=i ;j>=1 ; j--){
                System.out.print(j + " ");
            }
            for (int j=2 ; j<=i ; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }



}
