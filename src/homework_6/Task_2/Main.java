package homework_6.Task_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Dog> constructor = Dog.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Dog dog = (Dog) constructor.newInstance();
        constructor.setAccessible(false);
        dog.eat("Meat");
        dog.voice();
    }
}