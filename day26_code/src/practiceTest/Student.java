package practiceTest;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 4:00
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String s) {
        this.name = s.split("-")[0];
        this.age = Integer.parseInt(s.split("-")[2]);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
