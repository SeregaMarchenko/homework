package homework_17.Task_1;

public class LookForMinElementThread implements Runnable {
    private int[] array;

    public LookForMinElementThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int minElement = array[0];
        for (int j : array) {
            if (minElement > j) {
                minElement = j;
            }
        }
        System.out.println("Минимальный элемент: " + minElement);
    }
}
