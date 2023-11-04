package homework_7.Task_3;

public class Human implements Cloneable {
    private int age;
    private String name;
    private Cat cat;

    public Human(int age, String name, Cat cat) {
        this.age = age;
        this.name = name;
        this.cat = cat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public Human clone() {
        try {
            Human clone = (Human) super.clone();
            clone.cat = cat.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
