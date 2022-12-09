package abstractAnimal;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 19:57
 */
public class frog extends Animal{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
