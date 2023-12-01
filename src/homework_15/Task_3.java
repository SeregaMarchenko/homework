package homework_15;

import java.util.Scanner;
import java.util.function.Function;

public class Task_3 {
    public static void main(String[] args) {
        Function<String, Double> function = str -> Double.parseDouble(str.split(" +")[0]) * 3.3;
        System.out.println(function.apply(new Scanner(System.in).nextLine()));
    }
}