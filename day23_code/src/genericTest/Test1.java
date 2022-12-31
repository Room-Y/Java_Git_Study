package genericTest;

import java.util.ArrayList;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 2:51
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<LiHuaCat> lihua = new ArrayList<>();
        ArrayList<PersianCat> persian = new ArrayList<>();
        ArrayList<HuskyDog> husky = new ArrayList<>();
        ArrayList<TeddyDog> teddy = new ArrayList<>();

        keepPet(lihua);
        keepPet(persian);
        keepPet(husky);
        keepPet(teddy);
    }

//    public static void keepPet(ArrayList<? extends Cat> list){
//
//    }

//    public static void keepPet(ArrayList<? extends Dog> list){
//
//    }

    public static void keepPet(ArrayList<? extends Animal> list){

    }
}
