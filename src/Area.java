import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width,length;

        System.out.print("Input Width of Rectangle: ");
        width = scanner.nextDouble();
        System.out.print("Input Length of Rectangle: ");
        length = scanner.nextDouble();

        System.out.printf("Area of Rectangle: %d", (int)(length * width));
    }
}
