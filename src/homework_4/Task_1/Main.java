package homework_4.Task_1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard_1 = new CreditCard("3433456434452122", 12000);
        CreditCard creditCard_2 = new CreditCard("9067422434454622", 1400);
        CreditCard creditCard_3 = new CreditCard("7096456734454333", 15000);
        creditCard_1.chargeAmount(3400);
        creditCard_2.chargeAmount(32000);
        creditCard_3.withdrawAmount(4500);
        creditCard_1.getCardInformation();
        creditCard_2.getCardInformation();
        creditCard_3.getCardInformation();
    }
}
