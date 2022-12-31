package genericTest;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 2:54
 */
public class PersianCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的." + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
