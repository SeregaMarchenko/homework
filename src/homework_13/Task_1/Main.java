package homework_13.Task_1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final HashSet<Integer> HASH_SET = new HashSet<>();
    public static final int INPUT_QUANTITY = 7;

    public static void main(String[] args) {
        for (int i = 0; i < INPUT_QUANTITY; i++) {
            HASH_SET.add(SCANNER.nextInt());
        }
        System.out.println(HASH_SET);
    }
}
