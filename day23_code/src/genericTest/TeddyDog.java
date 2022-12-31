package genericTest;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 2:56
 */
public class TeddyDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的." + getAge() + "岁的泰迪，正在吃骨头，边吃边蹭");

    }
}
