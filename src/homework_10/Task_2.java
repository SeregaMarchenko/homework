package homework_10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String line = SCANNER.nextLine();
        Pattern patterMail = Pattern.compile("\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b");
        Pattern patterDokNumber = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Pattern patterNumberPhone = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}\\b");
        //тут должен быть regex "\\b\\+\\(\\d{2}\\)\\d{7}\\b" но он почему-то не работает ¯\_(ツ)_/¯
        Matcher matcherMail = patterMail.matcher(line);
        Matcher matcherNumberPhone = patterNumberPhone.matcher(line);
        Matcher matcherDocNumber = patterDokNumber.matcher(line);
        if (matcherMail.find()) {
            System.out.println("email: " + matcherMail.group());
        }
        if (matcherDocNumber.find()) {
            System.out.println("document number: " + matcherDocNumber.group());
        }
        if (matcherNumberPhone.find()) {
            System.out.println("number phone: " + matcherNumberPhone.group());
        }
    }
}