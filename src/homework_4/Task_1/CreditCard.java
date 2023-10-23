package homework_4.Task_1;

public class CreditCard {
    private String number;
    private int amount;

    public void chargeAmount(int amount) {
        System.out.println("Транзакция прошла успешно");
        this.amount += amount;
    }

    public int withdrawAmount(int amount) {
        if (this.amount < amount) {
            System.out.println("Недостаточная сумма на счете");
            return 0;
        } else {
            System.out.println("Транзакция прошла успешно");
            this.amount -= amount;
            return amount;
        }
    }

    public void getCardInformation() {
        System.out.println("номер карты: " + number);
        System.out.println("текущий счет: " + amount);
    }

    public CreditCard(String number, int amount) {
        this.number = number;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public int getAmount() {
        return amount;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
