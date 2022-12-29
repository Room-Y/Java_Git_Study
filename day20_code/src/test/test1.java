package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 21:17
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while(sum <= 200){
            System.out.println("请输入一个整数");
            String numstr = sc.nextLine();
            int num = Integer.parseInt(numstr);
            if(num < 1 || num > 100){
                System.out.println("当前数据有问题");
            }
            else{
                sum += num;
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
