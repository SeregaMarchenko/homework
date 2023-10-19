package homework_3;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][4];
        int sum = 0;
        System.out.println("начальный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("array[" + i + "][" + j + "]+=");
                array[i][j] += scanner.nextInt();
            }
        }
        System.out.println("новый массив");
        for (int[] array_1 : array) {
            for (int element : array_1) {
                System.out.print(element + " ");
                sum += element;
            }
            System.out.println();
        }
        System.out.println("сумма: " + sum);
    }
}
