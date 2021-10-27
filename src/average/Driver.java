package average;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input three numbers: ");
        Average.print(Average.calculate(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble()));
    }
}
