package objecct;

import com.google.gson.Gson;

/**
 * @author: Java_cmr
 * @Date: 2022/12/26 - 18:47
 */
public class object {
    public static void main(String[] args) throws CloneNotSupportedException {
        Object obj = new Object();
        System.out.println(obj.toString());

        Students st1 = new Students("zhangsan", 23);
        Students st2 = new Students("zhangsan", 23);

        System.out.println(st1.equals(st2));

        System.out.println();

        Students st3 = (Students) st1.clone();
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
        System.out.println(st1.equals(st3));

        Gson gson = new Gson();
        String s = gson.toJson(st1);
        Students st4 = gson.fromJson(s, Students.class);
    }
}
