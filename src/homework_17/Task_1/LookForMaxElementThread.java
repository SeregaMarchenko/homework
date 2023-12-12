package homework_17.Task_1;

public class LookForMaxElementThread implements Runnable {
    private int[] array;

    public LookForMaxElementThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int maxElement = array[0];
        for (int j : array) {
            if (maxElement < j) {
                maxElement = j;
            }
        }
        System.out.println("Максимальный элемент: " + maxElement);
    }
}
