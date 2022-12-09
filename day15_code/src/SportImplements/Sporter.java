package SportImplements;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:36
 */
public abstract class Sporter extends Person{
    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
