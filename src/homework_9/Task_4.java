package homework_9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_4 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Set<Character> SET_CHAR = new HashSet<>();

    public static void main(String[] args) {
        String str_1 = SCANNER.nextLine().trim();
        String str_2 = SCANNER.nextLine().trim();
        String str_3 = SCANNER.nextLine().trim();
        String strFind = null;
        String[] arrayStr = {str_1, str_2, str_3};
        for (String str : arrayStr) {
            if (strFind != null) {
                break;
            }
            char[] arrayChar = str.toCharArray();
            SET_CHAR.clear();
            for (int i = 0; i < str.length(); i++) {
                if (SET_CHAR.contains(arrayChar[i])) {
                    break;
                } else {
                    SET_CHAR.add(arrayChar[i]);
                }
                if (i == str.length() - 1) {
                    strFind = str;
                }
            }
        }
        System.out.println("Слово с разлиными символами: " + (strFind == null ? "не обнаружено" : strFind));
    }
}
