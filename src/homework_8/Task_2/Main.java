package homework_8.Task_2;

import java.util.*;

public class Main {

    public static final Map<Integer, User> MAP = new HashMap<>();

    public static void main(String[] args) {
        MAP.put(1, new User(1, "sergey123", "Sergey", new Cat("Max", 2)));
        MAP.put(2, new User(2, "slava23", "Slava", new Cat("Cat", 3)));
        MAP.put(3, new User(3, "petr13", "Petr", new Cat("Semen", 5)));
        MAP.put(4, new User(4, "natasha12", "Natasha", new Cat("Los", 1)));
        User userClone = Clone.clone((HashMap<Integer, User>) MAP);
        System.out.println("список пользователей:");
        for (Map.Entry<Integer, User> entry : MAP.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("Копия пользователя:");
        System.out.println(userClone);
    }
}
