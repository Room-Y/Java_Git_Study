package polymorphism_practice;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 13:18
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String food){
        System.out.println("年龄为"+age+"的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的宠物");
        if(a instanceof Dog d){
            d.eat(food);
        }
        else if(a instanceof Cat c){
            c.eat(food);
        }
    }
}
