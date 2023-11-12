package homework_9;

import java.util.Scanner;

public class Task_6 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        String[] words = SCANNER.nextLine().trim().split(" +");
        for (String word : words) {
            char[] arrayChar = word.toCharArray();
            for (int i = 0; i < arrayChar.length / 2; i++) {
                if (arrayChar[i] != arrayChar[arrayChar.length - i - 1]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }
        System.out.println("Строка " + (flag ? "" : "не ") + "состоит из слов палиндромов");
    }
}