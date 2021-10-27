package student;

public class A extends Marks{
    private double percentage;

    public A(double num1, double num2, double num3) {
        this.percentage = (num1 + num2 + num3) / 300;
    }

    @Override
    double getPercentage() {
        return percentage * 100;
    }
}
