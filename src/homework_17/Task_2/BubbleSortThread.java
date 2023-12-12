package homework_17.Task_2;

import java.util.Arrays;

public class BubbleSortThread implements Runnable {
    private int[] array;

    public BubbleSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int element = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = element;
                }
            }
        }
        System.out.println("Пузырьковая сортировка:\n" + Arrays.toString(array));
    }
}
