package SportImplements;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:40
 */
public class BasketBallSporter extends Sporter{
    public BasketBallSporter() {
    }

    public BasketBallSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
