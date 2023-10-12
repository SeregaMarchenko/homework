package homework_2;

import java.util.Scanner;

public class Task_3 {
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
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxInd = i;
            }
            if (min > array[i]) {
                min = array[i];
                minInd = i;
            }
        }
        System.out.println("\nиндекс максимального элемента = " + maxInd + "\n" + "индекс минимального элемента = " + minInd);
    }
}
