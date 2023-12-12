package homework_17.Task_2;

import java.util.Arrays;

public class InsertionSortThread implements Runnable {
    private int[] array;

    public InsertionSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int i, key, j;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println("Сортировка вставкой:\n" + Arrays.toString(array));
    }
}
