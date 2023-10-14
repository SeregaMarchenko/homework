package homework_2;

import java.util.Scanner;

public class Task_5 {
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
        System.out.println("массив перед преобразованием:");
        for (double element : array) {
            System.out.print(element + " ");
        }
        for (int i = 0; i < array.length/2; i++) {
            double element;
            element = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = element;
        }
        System.out.println("\nмассив почле преобразования:");
        for (double element : array) {
            System.out.print(element + " ");
        }
    }
}
