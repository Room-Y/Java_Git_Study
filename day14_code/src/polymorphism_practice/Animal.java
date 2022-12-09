package polymorphism_practice;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 13:11
 */
public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String s){
        System.out.println("它正在吃" + s);
    }
}

