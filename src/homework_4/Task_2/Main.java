package homework_4.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM(2, 4, 7);
        boolean value = true;
        while (value) {
            System.out.println("1.Снять деньги");
            System.out.println("2.Положить деньги");
            System.out.println("3.Данные о средствах банкомата");
            System.out.println("4.Завершить");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    if (atm.withdrawMoneyFromAnATM()) {
                        System.out.println("Операция прошла успешно!");
                    } else {
                        System.out.println("ошибка");
                    }
                }
                case 2 -> {
                    if (atm.toDeposit()) {
                        System.out.println("Операция прошла успешно!");
                    } else {
                        System.out.println("ошибка");
                    }
                }
                case 3 -> atm.viewInfo();
                case 4 -> value = false;
                default -> System.out.println("ошибка");
            }
        }
    }
}
