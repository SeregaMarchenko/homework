package homework_15;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Task_5 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> String.valueOf(new StringBuilder(new Scanner(System.in).nextLine()).reverse());
        System.out.println(supplier.get());
    }
}
