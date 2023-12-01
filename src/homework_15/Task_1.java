package homework_15;

import java.time.LocalDate;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите дату рождения");
        System.out.println("Вам исполнится сто лет\n"+LocalDate.parse(new Scanner(System.in).nextLine()).plusYears(100));
    }
}
