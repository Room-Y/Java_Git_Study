package com.list;

import java.util.ArrayList;

/**
 * @author: Java_cmr
 * @Date: 2022/12/6 - 19:42
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        list.remove("aaa");

        System.out.println(list);
    }
}
