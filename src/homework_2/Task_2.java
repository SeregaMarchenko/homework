package homework_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        double[] array = new double[scanner.nextInt()];
        System.out.println("1.Ввести элементы массива в ручную\n2.Случайное заполнение");
        switch (scanner.nextInt()) {
            case 1 -> {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("array[" + i + "]= ");
                    array[i] = scanner.nextDouble();
                }
            }
            case 2 -> {
                for (int i = 0; i < array.length; i++) {
                    array[i] = Math.random();
                }
            }
        }
        System.out.println("массив:");
        for (double element : array) {
            System.out.print(element + " ");
        }
        double max = array[0];
        double min = array[0];
        for (double element : array) {
            if (max < element) {
                max = element;
            }
            if (min > element) {
                min = element;
            }
        }
        System.out.println("\nмаксимальный = " + max + "\n" + "минимальный = " + min);
    }
}
