package homework_16;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(10));
        }
        Optional<Integer> sum = arrayList.stream()
                .distinct()
                .filter(number -> number % 2 == 0)
                .reduce(Integer::sum);
        System.out.println("Сумма равна " + sum.get());
    }
}
