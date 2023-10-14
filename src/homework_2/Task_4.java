package homework_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        double[] array = new double[scanner.nextInt()];
        System.out.println("1.Ввести элементы массива в ручную\n2.Случайное заполнение");
        switch (scanner.nextInt()) {
            case 1 -> {
                for (int i = 0; i < array.length; i++) {
                    System.out.print("array[" + i + "]= ");
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
        int quantity = 0;
        for (double element : array) {
            if (element == 0) {
                quantity++;
            }
        }
        System.out.println((quantity == 0 ? "\nнулевых элемнтов нет" : "\nнулевых элементов:" + quantity));
    }
}
