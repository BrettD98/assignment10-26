package student;

public class B extends Marks {
    private double percentage;

    public B(double num1, double num2, double num3, double num4) {
        this.percentage = (num1 + num2 + num3 + num4) / 400;
    }

    @Override
    double getPercentage() {
        return percentage * 100;
    }
}
