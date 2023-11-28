package homework_13.Task_2;

import java.util.LinkedList;

public class AnimalsCollection {
    private final LinkedList<String> ANIMAL_LINKED_LIST = new LinkedList<>();

    public void delete() {
        ANIMAL_LINKED_LIST.removeFirst();
    }

    public void add(String animal) {
        ANIMAL_LINKED_LIST.addLast(animal);
    }

    public LinkedList<String> getAnimalLinkedList() {
        return ANIMAL_LINKED_LIST;
    }
}
