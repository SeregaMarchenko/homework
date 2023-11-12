package homework_9;

import java.util.Scanner;

public class Task_5 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char[] str = SCANNER.nextLine().trim().toCharArray();
        char[] newStr = new char[str.length * 2];
        for (int i = 0; i < str.length; i++) {
            newStr[i * 2] = newStr[i * 2 + 1] = str[i];
        }
        System.out.println(newStr);
    }
}
