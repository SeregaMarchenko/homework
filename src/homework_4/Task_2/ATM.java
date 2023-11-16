package homework_4.Task_2;

import java.util.Scanner;

public class ATM {
    private int count_20;
    private int count_50;
    private int count_100;
    private int money;
    Scanner input = new Scanner(System.in);

    public ATM(int count_20, int count_50, int count_100) {
        this.count_20 = count_20;
        this.count_50 = count_50;
        this.count_100 = count_100;
        this.money = count_20 * 20 + count_50 * 50 + count_100 * 100;
    }

    public boolean toDeposit() {
        System.out.println("введите сумму которую вы хотите положить на счет");
        int count_100 = 0;
        int count_20 = 0;
        int count_50 = 0;
        int money = 0;
        int moneyInput = input.nextInt();
        if (moneyInput % 10 == 0) {
            while (moneyInput >= 100) {
                moneyInput -= 100;
                money += 100;
                count_100++;
            }
            while (moneyInput - 50 == 40 ||moneyInput - 50 == 20 || moneyInput == 50) {
                moneyInput -= 50;
                money += 50;
                count_50++;
            }
            while (moneyInput >= 20) {
                moneyInput -= 20;
                money += 20;
                count_20++;
            }
            if (moneyInput == 0) {
                this.money += money;
                this.count_50 += count_50;
                this.count_100 += count_100;
                this.count_20 += count_20;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean withdrawMoneyFromAnATM() {
        int count_100 = this.count_100;
        int count_20 = this.count_20;
        int count_50 = this.count_50;
        System.out.println("введите сумму которую хотите снять со счета");
        int money = this.money;
        int moneyInput = input.nextInt();
        if ((moneyInput % 20 == 0 || moneyInput % 50 == 0 || (moneyInput - 50) % 20 == 0) && moneyInput <= money) {
            while (count_100 != 0 && moneyInput >= 100) {
                moneyInput -= 100;
                money -= 100;
                count_100 -= 1;
            }
            while (count_50 != 0 && (moneyInput - 50 == 40||moneyInput - 50 == 20 || moneyInput == 50)) {
                moneyInput -= 50;
                money -= 50;
                count_50 -= 1;
            }
            while (count_20 != 0 && moneyInput >= 20) {
                moneyInput -= 20;
                money -= 20;
                count_20 -= 1;
            }
            if (count_20 < 0 || count_100 < 0 || count_50 < 0) {
                System.out.println("операция невозможна из-за отсутствия подходящих купюр");
                return false;
            }
            if (moneyInput != 0) {
                return false;
            }
            if (this.count_100 - count_100 > 0) {
                System.out.println(this.count_100 - count_100 + " купюр по 100");
            }
            if (this.count_50 - count_50 > 0) {
                System.out.println(this.count_50 - count_50 + " купюр по 50");
            }
            if (this.count_20 - count_20 > 0) {
                System.out.println(this.count_20 - count_20 + " купюр по 20");
            }
            System.out.println();
            this.count_20 = count_20;
            this.count_100 = count_100;
            this.count_50 = count_50;
            this.money = money;
            return true;
        } else {
            return false;
        }
    }

    public void viewInfo() {
        System.out.println("сумма в банкомате: " + this.money);
        System.out.println("купюр по 100: " + this.count_100);
        System.out.println("купюр по 50: " + this.count_50);
        System.out.println("купюр по 20: " + this.count_20);
        System.out.println();
    }
}
