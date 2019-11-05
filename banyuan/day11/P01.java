package banyuan.day11;

import java.io.*;
import java.util.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/5
 * 将一个集合里面的学生对象存储到指定的文件中去，每个学生信息单独占一行
 * 学生属性:学生编号 学生姓名 学生密码  学生年龄  学生班级
 * 要求: 1.学生选择登陆功能,如果文件中没有该学生的信息那么就得注册
 * 2.根据输入的学生的姓名获取指定学生的所有信息
 * 3.根据所有学生的年龄进行降序排序
 */
public class P01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("student.txt");
        List list = new ArrayList();
        list.add(new Student(01, "刘国泰1", "1234561", 21, "01"));
        list.add(new Student(02, "刘国泰2", "1234562", 42, "02"));
        list.add(new Student(03, "刘国泰3", "1234563", 13, "03"));
        list.add(new Student(04, "刘国泰4", "1234564", 24, "04"));
        list.add(new Student(05, "刘国泰5", "1234565", 65, "05"));
        if (!file.exists()) {
            file.createNewFile();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        for (int i = 0; i < list.size(); i++) {
            oos.writeObject(list.get(i));

        }
        //  oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Student line = (Student) ois.readObject();
//        while (line != null) {
//            try {
//                System.out.println(line.toString());
//                line = (Student) ois.readObject();
//            } catch (EOFException e) {
//                break;
//            }
//        }
        // ois.close();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名进行登陆");
        String input = in.next();
        for (int i = 0; i < list.size(); i++) {
            if (input.equals(((Student) list.get(i)).getStuName())) {
                System.out.println(list.get(i));
                break;
            } else {
                System.out.println("请进行注册：分别输入：编号，姓名，密码，年龄，班级");
                int in1 = in.nextInt();
                String in2 = in.next();
                String in3 = in.next();
                int in4 = in.nextInt();
                String in5 = in.next();
                oos.writeObject(new Student(in1, in2, in3, in4, in5));
                list.add(new Student(in1, in2, in3, in4, in5));
                break;
            }

        }
        while (line != null) {
            try {
                System.out.println(line.toString());
                line = (Student) ois.readObject();

            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
        oos.close();
        System.out.println("请输入查询的姓名");
        String input2 = in.next();
        for (int i = 0; i < list.size(); i++) {
            if (input2.equals(((Student) list.get(i)).getStuName())) {
                System.out.println(list.get(i));
            }
        }
        // ois.close();
        // oos.close();

        Collections.sort(list);
        for (Object c:list) {
            System.out.println((Student)c);
        }

    }
}