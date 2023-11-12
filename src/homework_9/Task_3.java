package homework_9;

import java.util.Scanner;

public class Task_3 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String str_1 = SCANNER.nextLine().trim();
        String str_2 = SCANNER.nextLine().trim();
        String str_3 = SCANNER.nextLine().trim();
        String[] arrayStr = {str_1, str_2, str_3};
        int mediumLength = (str_1.length() + str_2.length() + str_3.length()) / 3;
        for (String str : arrayStr) {
            if (str.length() < mediumLength) {
                System.out.println(str + "|  Длина " + str.length());
            }
        }
    }
}
