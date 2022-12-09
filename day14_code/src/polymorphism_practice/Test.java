package polymorphism_practice;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 13:29
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李", 25);

        Dog a1 = new Dog(2, "黑");
        Cat a2 = new Cat(2, "灰");

        p1.keepPet(a1, "骨头");
        p2.keepPet(a1, "鱼");
    }
}
