package lambda;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 15:50
 */
public class lambda {
    public static void main(String[] args) {
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳……");
            }
        });

        method(() -> {
            System.out.println("正在啥的爱上放大发");
        });
    }

    public static void method(Swim s){
        s.swimming();
    }
}

interface Swim{
    public abstract void swimming();
}


