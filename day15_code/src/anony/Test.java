package anony;

/**
 * @author: Java_cmr
 * @Date: 2022/12/9 - 15:03
 */
public class Test {
    public static void main(String[] args) {

        new Swim(){
            public void swim(){
                System.out.println("重写了游泳");
            }
        };

        new Animal(){
            @Override
            public void eat(){
                System.out.println("重写了eat方法");
            }
        };
    }
}
