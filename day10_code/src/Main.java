import java.util.Scanner;

/**
 * @author: Java_cmr
 * @Date: ${DATE} - ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String rightusername = "zhangsan";
        String rightPassword = "123456";

        for(int i = 0; i < 3; i++){

        }
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if(username.equals(rightusername) && password.equals(rightPassword)){
                System.out.println("用户登陆成功！");
                break;
            }
            else{
                System.out.printf("用户登陆失败！还剩下 %d 次机会", 2 - i);
            }
        }

    }
}