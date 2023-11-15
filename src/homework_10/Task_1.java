package homework_10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b[a-zа-я]{2,6}\\b");
        Matcher matcher = pattern.matcher(new Scanner(System.in).nextLine());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
