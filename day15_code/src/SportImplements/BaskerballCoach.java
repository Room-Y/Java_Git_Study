package SportImplements;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:42
 */
public class BaskerballCoach extends Coach{
    public BaskerballCoach() {
    }

    public BaskerballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练正在教如何打篮球");
    }


}
