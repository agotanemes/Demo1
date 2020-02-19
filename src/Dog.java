public class Dog {
    private String color;
    private int age;
    private String name;

    public Dog(String color, int age, String name) {
        this.color = color;
        this.age = age;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
