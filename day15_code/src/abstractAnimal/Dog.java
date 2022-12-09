package abstractAnimal;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 19:57
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗再吃骨头");
    }


}
