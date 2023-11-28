package homework_13.Task_3;

import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> marks;

    public Student(String name, String group, int course, ArrayList<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public int getAverageMark() {
        int averageMark = 0;
        for (Integer mark : marks) {
            averageMark += mark;
        }
        averageMark /= marks.size();
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
