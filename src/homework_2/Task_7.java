package homework_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
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
                    array[i] = (int) (Math.random() * 9);
                }
            }
        }
        System.out.print("массив:\n");
        System.out.println(Arrays.toString(array));
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - i - 1] + 1 == 10) {
                array[array.length - i - 1] = 0;
            } else {
                array[array.length - i - 1] += 1;
                flag = false;
                break;
            }
        }
        System.out.print("новый массив:\n");
        if (flag) {
            double[] newArray = new double[array.length + 1];
            newArray[0] = 1;
            if (array.length - 1 >= 0) System.arraycopy(array, 0, newArray, 1, array.length - 1);
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println(Arrays.toString(array));
        }
    }
}
