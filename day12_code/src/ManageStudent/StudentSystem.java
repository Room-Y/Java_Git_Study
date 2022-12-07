package ManageStudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 11:59
 */
public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
       loop: while (true) {
            System.out.println("--------------------欢迎来到黑马学生管理系统--------------------");
            System.out.println("1:添加学生:");
            System.out.println("2:删除学生:");
            System.out.println("3:修改学生:");
            System.out.println("4:查询学生:");
            System.out.println("5:退出~");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
            System.out.println();
        }
    }

    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String id;

        while (true) {
            System.out.println("请输入学生的ID：");
            id = sc.next();

            if(checkID(list, id) == -1)
                break;
            else
                System.out.println("id已经存在，请重新录入");

        }

        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的家庭住址：");
        String address = sc.next();

        Student su = new Student(id, name, age, address);
        list.add(su);
        System.out.println("成功添加学生" + name);

    }

    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入想要删除的ID：");
        String id = sc.next();
        int idx = checkID(list, id);
        if(idx == -1) {
            System.out.println("不存在要删除的学生ID");
            return;
        }

        String name = list.get(idx).getName();
        list.remove(idx);
        System.out.println("成功删除学生" + name);
    }

    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改学生的ID：");
        String id = sc.next();
        int idx = checkID(list, id);
        if(idx == -1){
            System.out.println("要修改的ID不存在！");
            return;
        }

        Student su = list.get(idx);
        System.out.println("请输入要修改学生的姓名");
        String name = sc.next();
        su.setName(name);

        System.out.println("请输入要修改学生的年龄：");
        int age = sc.nextInt();
        su.setAge(age);

        System.out.println("请输入要修改学生的家庭住址：");
        String address = sc.next();
        su.setAddress(address);

        System.out.println("学生信息成功修改");
    }

    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后执行！");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for(int i = 0; i < list.size(); i++){
            Student su = list.get(i);
            System.out.println(su.getID() + '\t' + su.getName() + '\t' + su.getAge() + '\t' + su.getAddress());
        }
        return;
    }

    public static int checkID(ArrayList<Student> list, String id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getID().equals(id))
                return i;
        }
        return -1;
    }
}
