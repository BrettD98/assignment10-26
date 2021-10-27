import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, interest;
        int roll;

        System.out.print("Input Name: ");
        name = scanner.nextLine();
        System.out.print("Input Roll Number: ");
        roll = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input Interests: ");
        interest = scanner.nextLine();

        System.out.printf("Hey, my name is %s and my roll number is %d. My field of interest are %s.",name,roll,interest);
    }
}
