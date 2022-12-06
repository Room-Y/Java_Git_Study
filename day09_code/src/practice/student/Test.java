package practice.student;

/**
 * @author: Java_cmr
 * @Date: 2022/12/2 - 20:11
 */
public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "赵六", 26);

    }
}
