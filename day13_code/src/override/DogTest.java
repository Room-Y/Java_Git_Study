package override;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 20:03
 */
public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();
    }
}
