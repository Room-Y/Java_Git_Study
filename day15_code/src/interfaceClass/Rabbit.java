package interfaceClass;


/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:12
 */
public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
