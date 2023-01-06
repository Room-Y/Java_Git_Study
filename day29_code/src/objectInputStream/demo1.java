package objectInputStream;

import java.io.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 21:14
 */
public class demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student("zhangsan", 23, "南京");
        System.out.println(stu);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29_code\\src\\objectInputStream\\a.txt"));
        oos.writeObject(stu);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29_code\\src\\objectInputStream\\a.txt"));
        Object o = (Student)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
