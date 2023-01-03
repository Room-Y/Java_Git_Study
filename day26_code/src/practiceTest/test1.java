package practiceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 4:15
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }
}
