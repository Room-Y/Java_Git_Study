package com.arithme;

import java.util.Scanner;

/**
 * @author: Java_cmr
 * @Date: 2022/11/30 - 20:30
 */
public class ArithmeticOperationDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个三位数：");
//        int num1 = sc.nextInt();
//        System.out.println(num1 % 10);
//        num1 /= 10;
//        System.out.println(num1 % 10);
//        num1 /= 10;
//        System.out.println(num1 % 10);
        byte b1 = 10;
        byte b2 = 20;
        byte b = (byte)(b1 + b2);
        System.out.println(b++);
        System.out.println(++b);
    }
}
