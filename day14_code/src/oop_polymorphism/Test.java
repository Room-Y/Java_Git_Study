package oop_polymorphism;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 20:44
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(48);

        Admin a = new Admin();
        a.setName("管理员");
        a.setAge(60);

        register(s);
        register(t);
        register(a);

    }

    public static void register(Person p){
        p.show();
    }
}
