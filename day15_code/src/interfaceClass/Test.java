package interfaceClass;

import java.text.Format;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:15
 */
public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青", 1);
        System.out.println(f.toString());
        f.eat();
        f.swim();


        Dog d = new Dog("大黄", 2);
        System.out.println(d.toString());
        d.eat();
        d.swim();


        Rabbit r = new Rabbit("小白", 1);
        System.out.println(r.toString());
        r.eat();
    }
}
