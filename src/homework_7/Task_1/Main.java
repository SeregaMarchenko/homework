package homework_7.Task_1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();
        director.print();
        accountant.print();
        worker.print();
    }
}
