package homework_17.Task_2;

import java.util.Arrays;

public class SelectionSortThread implements Runnable {
    private int[] array;

    public SelectionSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int element = array[i];
            array[i] = array[minIndex];
            array[minIndex] = element;
        }
        System.out.println("Сортировка выборкой:\n" + Arrays.toString(array));
    }
}
