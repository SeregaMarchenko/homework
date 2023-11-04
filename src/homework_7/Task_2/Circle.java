package homework_7.Task_2;

public class Circle extends Figure {
    private final double P = 3.14;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return P * radius * radius;
    }

    @Override
    double square() {
        return 2 * P * radius;
    }
}
