package homework_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task_2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> arrayStr = new ArrayList<>();
        arrayStr.add(SCANNER.nextLine().trim());
        arrayStr.add(SCANNER.nextLine().trim());
        arrayStr.add(SCANNER.nextLine().trim());
        arrayStr.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}

