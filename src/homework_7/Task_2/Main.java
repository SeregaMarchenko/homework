package homework_7.Task_2;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(3),
                new Rectangle(5, 6),
                new Triangle(6),
                new Rectangle(2, 5),
                new Circle(6)
        };
        for (Figure figure : figures) {
            System.out.println(figure.area() + "   " + figure.square());
        }
    }
}
