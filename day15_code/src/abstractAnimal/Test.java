package abstractAnimal;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 19:58
 */
public class Test {
    public static void main(String[] args) {
        frog f = new frog("小绿", 1);
        f.eat();
        f.drink();

        Dog d = new Dog("小紫", 6);
        d.eat();
        d.drink();
    }
}
