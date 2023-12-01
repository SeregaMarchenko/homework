package homework_15;

import java.util.Scanner;
import java.util.function.Consumer;

public class Task_4 {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(Double.parseDouble(str.split(" +")[0]) * 3.3);
        consumer.accept(new Scanner(System.in).nextLine());
    }
}
