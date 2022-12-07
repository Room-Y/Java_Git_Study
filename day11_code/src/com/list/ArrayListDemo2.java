package com.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Java_cmr
 * @Date: 2022/12/6 - 20:03
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

//        Student s1 = new Student("zhangsan", 23);
//        Student s2 = new Student("lisi", 24);
//        Student s3 = new Student("wangwu", 25);
//
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("请输入姓名与年龄：");
            String name = sc.next();
            int age = sc.nextInt();
            Student su = new Student(name, age);
            list.add(su);
        }

        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            Student su = list.get(i);
            System.out.println(su.getName() + ", " + su.getAge());
        }
    }
}
