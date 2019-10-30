package banyuan.day06.p02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        stu[0] = new Student(01, "张三", 20);
        stu[1] = new Student(02, "李四", 18);
        stu[2] = new Student(03, "王五", 22);
        stu[3] = new Student(04, "赵六", 20);
        stu[4] = new Student(05, "田七", 21);

        Scanner in = new Scanner(System.in);
        System.out.println("输入姓名：");
        String input = in.next();
        for (int i = 0; i < stu.length; i++) {
            if (input.equals(stu[i].getName())) {
                System.out.println(stu[i].toString());
            }

        }
        if (input.equals("张三")) {
            stu[0].setName("张兵");
            System.out.println(stu[0].toString());
        }

        int a = stu[0].getAge();
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getAge() > a) {
                a = stu[i].getAge();
            }
        }
        System.out.println("最大年龄" + a);

        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getAge() < a) {
                a = stu[i].getAge();
            }
        }
        System.out.println("最小年龄" + a);
        a = 0;
        for (int i = 0; i < stu.length; i++) {

            a += stu[i].getAge();

        }

        System.out.println("平均年龄" + (a / stu.length));
    }
}
