import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Given Number: " + number);
        System.out.println("Binary equivalent: " + convertToBinary(number));
        System.out.println("Octal equivalent: " + convertToOctal(number));
        System.out.println("Hexadecimal equivalent: " + convertToHexadecimal(number));
    }

    public static String convertToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static String convertToOctal(int number) {
        return Integer.toOctalString(number);
    }

    public static String convertToHexadecimal(int number) {
        return Integer.toHexString(number);
    }
}
