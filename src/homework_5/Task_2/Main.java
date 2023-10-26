package homework_5.Task_2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        Field field = apple.getClass().getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple,"Green");
        System.out.println(field.get(apple));
        field.setAccessible(false);
    }
}
