package oop_polymorphism;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 20:43
 */
public class Teacher extends Person{
    @Override
    public void show(){
        System.out.println("老师的信息为："  + getName() + ", " + getAge());
    }
}
