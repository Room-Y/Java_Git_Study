package practice;

import java.util.Arrays;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 15:59
 */
public class test1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend gf2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend gf3 = new GirlFriend("xiaohuihui", 19, 1.78);
        GirlFriend gf4 = new GirlFriend("abc", 19, 1.78);

        GirlFriend[] arr = {gf1, gf2, gf3, gf4};

        Arrays.sort(arr, (o1, o2)->{
            if(o1.getAge() == o2.getAge()){
                if(o1.getHeight() == o2.getHeight()){
                    return o1.getName().compareTo(o2.getName());
                }
                else{
                    return o1.getHeight() > o2.getHeight() ? 1 : -1;
                }
            }
            return o1.getAge() > o2.getAge() ? 1 : -1;
        });

        System.out.println(Arrays.toString(arr));
    }
}


