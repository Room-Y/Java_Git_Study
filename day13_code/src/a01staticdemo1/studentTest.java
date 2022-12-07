package a01staticdemo1;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 15:09
 */
public class studentTest {
    public static void main(String[] args) {
        Student.teacher = "阿伟老师";
        Student s1 = new Student("张三", 23, "男");
        s1.study();
        s1.show();

        Student s2 = new Student("李四", 22, "女");
        s2.study();
        s2.show();

        return;
    }
}
