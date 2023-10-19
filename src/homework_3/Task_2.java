package homework_3;

public class Task_2 {
    public static void main(String[] args) {
        String[][] array = new String[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + j) % 2 == 0 ? "W" : "B";
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
