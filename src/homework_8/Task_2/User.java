package homework_8.Task_2;

import java.util.Objects;

public class User implements Cloneable {
    private Cat cat;
    private int id;
    private String password;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String password, String name, Cat cat) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.cat = cat;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(cat, user.cat) && Objects.equals(password, user.password) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cat, id, password, name);
    }
}