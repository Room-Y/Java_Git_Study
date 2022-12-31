package genericTest;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 2:55
 */
public class LiHuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的." + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
