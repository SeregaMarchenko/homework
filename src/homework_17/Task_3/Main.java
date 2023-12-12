package homework_17.Task_3;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread user = new Thread(new User(shop));
        Thread provider = new Thread(new Provider(shop));
        provider.start();
        user.start();
    }
}