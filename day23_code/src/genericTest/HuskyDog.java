package genericTest;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 2:57
 */
public class HuskyDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一直叫做" + getName() + "的." + getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
