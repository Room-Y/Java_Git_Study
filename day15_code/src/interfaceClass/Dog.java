package interfaceClass;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:14
 */
public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
