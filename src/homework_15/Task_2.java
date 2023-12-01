package homework_15;

import java.util.function.Predicate;

public class Task_2 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = number -> number > 0;
        int[] array = {3, 5, 4, -7, 0, -4, -8, -9, -38, 8, 28};
        for (int number : array) {
            if (predicate.test(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
