package homework_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите n");
        int n = scanner.nextInt();
        System.out.println("ведите m");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int count = 0;
        int addElement = 1;
        int begin = 0;
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = begin; j < array[i].length && j >= 0; j += addElement) {
                array[i][j] = ++count;
                if (j == array[i].length - 1 && flag) {
                    addElement = -1;
                    begin = array[i].length - 1;
                    flag = false;
                    break;
                }
                if (j == 0 && !flag) {
                    addElement = 1;
                    begin = 0;
                    flag = true;
                    break;
                }
            }
        }
        System.out.println("массив");
        for (int[] array_1 : array) {
            for (int element : array_1) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
