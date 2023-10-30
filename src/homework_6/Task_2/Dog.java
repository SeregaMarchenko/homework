package homework_6.Task_2;

public class Dog {
    private Dog() {
    }
    public void voice(){
        System.out.println("gav-gav");
    }
    void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("I like "+food);
        }else{
            System.out.println("I do not like "+food);
        }
    }
}
