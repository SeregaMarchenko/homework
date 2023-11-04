package homework_7.Task_3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(13, "Max", new Cat(2, "Tor"));
        Human humanClone = human.clone();
        human.getCat().setAge(4);
        System.out.println(human);
        System.out.println(humanClone);
    }
}
