package homework_11.Task_2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Some code...");
            System.exit(0);
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Some code...");
        }
    }
}
