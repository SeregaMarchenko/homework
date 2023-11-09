package homework_8.Task_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Clone {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static User clone(HashMap<Integer, User> map) {
        User user;
        System.out.println("Введите индекс пользования которого вы хотите скопировать");
        while (true) {
            int index = SCANNER.nextInt();
            if (map.get(index) == null) {
                System.out.println("Ошибка,нет пользователя с данным id,введите id заново");
            } else {
                user = map.get(index);
                break;
            }
        }
        System.out.println("нажмите на цифру необходимой операции клонирования\n1.Поверхностное\n2.Глубокое");
        while (true) {
            int choice = SCANNER.nextInt();
            switch (choice) {
                case 1 -> {
                    return user.clone();
                }
                case 2 -> {
                    User userClone = user.clone();
                    userClone.setCat(user.getCat().clone());
                    return userClone;
                }
                default -> System.out.println("Ошибка,введите корректный номер меню!!!");
            }
        }
    }
}
