package objectInputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Java_cmr
 * @Date: 2023/1/7 - 0:01
 */
public class test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("zhangsan", 23, "南京");
        Student s2 = new Student("李四", 24, "上海");
        Student s3 = new Student("王五", 25, "北京");

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29_code\\src\\objectInputStream\\test1.txt"));
//        oos.writeObject(s1);
//        oos.writeObject(s2);
//        oos.writeObject(s3);
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29_code\\src\\objectInputStream\\test1.txt"));
//        System.out.println(ois.readObject());
//        System.out.println(ois.readObject());
//        System.out.println(ois.readObject());
//        ois.close();

        ArrayList<Student> list = new ArrayList<>();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29_code\\src\\objectInputStream\\test2.txt"));
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29_code\\src\\objectInputStream\\test2.txt"));
        ArrayList<Student> list1 = (ArrayList<Student>)ois.readObject();
        list1.forEach(s -> System.out.println(s));
        ois.close();


    }
}
