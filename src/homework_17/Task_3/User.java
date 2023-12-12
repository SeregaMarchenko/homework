package homework_17.Task_3;

import java.util.ArrayList;
import java.util.List;

public class User implements Runnable {
    private Shop shop;

    public User(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        List<Product> products = new ArrayList<>();
        while (products.size() != 5) {
            if (!shop.isEmpty()) {
                products.add(shop.getProduct());
            }
        }
        System.out.println(products);
    }
}