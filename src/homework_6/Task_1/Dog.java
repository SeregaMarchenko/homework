package homework_6.Task_1;

public class Dog extends Animal{
    @Override
    void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("I like "+food);
        }else{
            System.out.println("I do not like "+food);
        }
    }

    @Override
    void voice() {
        System.out.println("gav-gav");
    }
}
