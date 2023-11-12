package homework_9;

import java.util.Scanner;

public class Task_1 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] text = {SCANNER.nextLine().trim(), SCANNER.nextLine().trim(), SCANNER.nextLine().trim()};
        String minText = text[0];
        String maxText = text[0];
        for (String line : text) {
            maxText = maxText.length() < line.length() ? line : maxText;
            minText = minText.length() > line.length() ? line : minText;
        }
        System.out.println("наибольшая строка: " + maxText);
        System.out.println("наименьшая строка: " + minText);
    }
}
