package SportImplements;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:37
 */
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
