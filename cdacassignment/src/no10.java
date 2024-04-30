import java.util.Arrays;
import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        String[] nameOfStudents = new String[10];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        // Reading names of students
        System.out.println("Enter names of students (up to 10, enter 'done' to finish):");
        while (count < 10) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            nameOfStudents[count] = input;
            count++;
        }

        // Sorting the array of names
        Arrays.sort(nameOfStudents, 0, count);

        // Displaying the sorted names
        System.out.println("Sorted Names of Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(nameOfStudents[i]);
        }

    }
}
