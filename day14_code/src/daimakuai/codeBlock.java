package daimakuai;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 19:23
 */
public class codeBlock {
    private int age;
    private String name;


    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public codeBlock() {
    }

    public codeBlock(int age, String name) {
        this.age = age;
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

    public String toString() {
        return "codeBlock{age = " + age + ", name = " + name + "}";
    }
}
