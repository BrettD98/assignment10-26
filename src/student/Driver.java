package student;

public class Driver {

    public static void main(String[] args) {
        A a = new A(86,92,96);
        B b = new B(78,65,96,90);

        System.out.println("Percentage of student A is: " + a.getPercentage());
        System.out.println("Percentage of student B is: " + b.getPercentage());
    }
}
