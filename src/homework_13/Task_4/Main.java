package homework_13.Task_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>();
        collection.addElement(4);
        collection.addElement(8);
        collection.addElement(13);
        collection.addElement(87);
        System.out.println(collection);
        System.out.println(collection.isContains(98));
        System.out.println(collection.isContains(13));
        collection.delete(8);
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
    }
}
