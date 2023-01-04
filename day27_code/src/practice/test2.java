package practice;

import java.util.Scanner;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 19:09
 */
public class test2 {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("请输入你女朋友的姓名：");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("请输入你女朋友的年龄：");
                int age = Integer.parseInt(sc.nextLine());
                gf.setAge(age);
                System.out.println(gf);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (AgeOutofBoundException e){
                e.printStackTrace();
            } catch (NameFormatException e){
                e.printStackTrace();
            }
        }
    }
}
