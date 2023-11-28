package homework_13.Task_2;

public class Main {
    public static void main(String[] args) {
        AnimalsCollection animalsCollection = new AnimalsCollection();
        animalsCollection.add("Слон");
        animalsCollection.add("Собака");
        animalsCollection.add("Кот");
        animalsCollection.delete();
        animalsCollection.add("Тигр");
        System.out.println(animalsCollection.getAnimalLinkedList());
    }
}
