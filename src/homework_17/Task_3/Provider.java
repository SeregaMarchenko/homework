package homework_17.Task_3;

public class Provider implements Runnable {
    private Shop shop;

    public Provider(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        int productCreatedNumbers = 0;
        while (productCreatedNumbers != 6) {
            if (!shop.isFilled()) {
                shop.addProduct(new Product());
                productCreatedNumbers++;
            }
        }
        System.out.println(productCreatedNumbers);
    }
}
