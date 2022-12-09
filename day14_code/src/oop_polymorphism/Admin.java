package oop_polymorphism;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 20:44
 */
public class Admin extends Person{
    @Override
    public void show(){
        System.out.println("管理员的信息为："  + getName() + ", " + getAge());
    }
}
