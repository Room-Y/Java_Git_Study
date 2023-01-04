package practice;

import java.util.Scanner;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 18:31
 */
public class test1 {
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
                System.out.println("年龄格式有误，请输入数字");
            } catch (RuntimeException e){
                System.out.println("姓名的长度或者年龄的范围有误");
            }
        }
    }
}
