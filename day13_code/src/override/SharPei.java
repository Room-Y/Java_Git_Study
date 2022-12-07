package override;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 20:02
 */
public class SharPei extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("狗啃骨头");
    }
}
