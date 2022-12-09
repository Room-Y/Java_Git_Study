package polymorphism_practice;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 13:16
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome(){
        System.out.println("它正在看家");
    }
    public void eat(String str){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"颜色的狗两只前腿死死的抱住"+str+"猛吃");
    }
}
