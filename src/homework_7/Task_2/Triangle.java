package homework_7.Task_2;

public class Triangle extends Figure {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return Math.sqrt(3) * side * side / 4;
    }

    @Override
    double square() {
        return 3 * side;
    }
}
