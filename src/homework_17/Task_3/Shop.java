package homework_17.Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Shop {

    public static final int MAX_SIZE = 3;
    public static final CopyOnWriteArrayList<Product> PRODUCT_LIST = new CopyOnWriteArrayList<>();

    public void addProduct(Product product) {
        PRODUCT_LIST.add(product);
    }

    public Product getProduct() {
        Product product = PRODUCT_LIST.get(0);
        PRODUCT_LIST.remove(0);
        return product;
    }

    public boolean isEmpty() {
        return PRODUCT_LIST.isEmpty();
    }

    public boolean isFilled() {
        return PRODUCT_LIST.size() == MAX_SIZE;
    }
}