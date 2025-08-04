package access_modifier;

public class Animal {
    private int id;

    String name;//default

    protected String color;

    public int age;

    void input() {
        this.id = 1;
        this.name = "abc";
        this.color = "yellow";
        this.age = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

