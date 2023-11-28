package homework_13.Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static final int NUMBER_OF_STUDENTS = 10;
    public static final int NUMBER_OF_MARKS = 10;
    public static final Random RANDOM = new Random();
    public static final String[] ARRAY_NAMES = new String[]{"Max", "Oleg", "Sergey", "Kirill", "Marina", "Nasty", "Oksana", "Ksenia", "Mary", "Danil"};
    public static final String[] ARRAY_GROUPS = new String[]{"32j4", "56y6", "76y5", "15t5", "87u6", "36g5", "98m7", "11g6", "63f4", "76u8"};

    public static void main(String[] args) {
        ArrayList<Student> arrayListStudents = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            ArrayList<Integer> marksList = new ArrayList<>();
            for (int j = 0; j < NUMBER_OF_MARKS; j++) {
                marksList.add(Math.abs(RANDOM.nextInt() % 11));
            }
            arrayListStudents.add(new Student(ARRAY_NAMES[i], ARRAY_GROUPS[i], Math.abs(RANDOM.nextInt() % 5 + 1), marksList));
        }
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            if (arrayListStudents.get(i).getAverageMark() >= 3) {
                arrayListStudents.get(i).setCourse(arrayListStudents.get(i).getCourse() + 1);
            }
        }
        printStudents(arrayListStudents, 3);
    }

    public static void printStudents(List<Student> list, int course) {
        for (Student student : list) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
