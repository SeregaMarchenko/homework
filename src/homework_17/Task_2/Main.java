package homework_17.Task_2;

import java.util.Scanner;

public class Main {
    public static final int NUMBERS_ARRAY = 10;
    public static final int[] ARRAY = new int[NUMBERS_ARRAY];
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < ARRAY.length; i++) {
            System.out.print("Введите array[" + i + "]= ");
            ARRAY[i] = SCANNER.nextInt();
        }
        Thread bubbleSortThread = new Thread(new BubbleSortThread(ARRAY));
        Thread insertSortThread = new Thread(new InsertionSortThread(ARRAY));
        Thread selectionSortThread = new Thread(new SelectionSortThread(ARRAY));
        bubbleSortThread.start();
        insertSortThread.start();
        selectionSortThread.start();
    }
}
