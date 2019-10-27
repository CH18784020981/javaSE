package banyuan.day03;

import javax.tools.Tool;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请选择你要进行的操作\n" +
                "1...增加\n" +
                "2...删除\n" +
                "3...查找\n" +
                "4...修改\n");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1:
                add()
                ;
                break;
            case 2:
                delete();
                ;
                break;
            case 3:
                get()
                ;
                break;
            case 4:
                update()
                ;
                break;
        }
    }

    public static void add() {
        while (Tools.count < 10) {
            Scanner in = new Scanner(System.in);
            System.out.println("姓名");
            String name = in.next();
            System.out.println("年龄");
            int age = in.nextInt();
            System.out.println("性别");
            String sex = in.next();
            System.out.println("地址");
            String address = in.next();
            Tools.person[Tools.count++] = new Person(name, age, sex, address);

            //Tools.count++;
        }

        for (int i = 0; i < Tools.count; i++) {
            System.out.println(Tools.person[i]);
        }
    }

    public static void delete() {
        System.out.println("你要删除第几个数据");
        Scanner m = new Scanner(System.in);
        int num = m.nextInt();
        if (num > Tools.count) {
            System.out.println("没有该数据，请输入小点的数");
            for (int i = 0; i < Tools.count; i++) {
                System.out.println(Tools.person[i]);
            }
        } else {
            for (int i = num; i < Tools.count - 1; i++) {
                Tools.person[i] = Tools.person[i + 1];
            }
            Tools.count--;
            System.out.println("剩下的人物信息为：");
            for (int i = 0; i < Tools.count; i++) {
                System.out.println(Tools.person[i]);
            }
        }
    }

    public static void get() {
        System.out.println("有" + Tools.count + "个数据，请选择你要查询的");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(Tools.person[input - 1]);
    }

    public static void update() {
        System.out.println("有" + Tools.count + "个数据，请选择你要修改的");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(Tools.person[input - 1]);
        System.out.println("修改后的");
        System.out.println("姓名");
        String name = in.next();
        System.out.println("年龄");
        int age = in.nextInt();
        System.out.println("性别");
        String sex = in.next();
        System.out.println("地址");
        String address = in.next();
        Tools.person[input - 1].setName(name);
        Tools.person[input - 1].setSex(sex);
        Tools.person[input - 1].setAge(age);
        Tools.person[input - 1].setAddress(address);
        for (int i = 0; i < Tools.count; i++) {
            System.out.println(Tools.person[i]);
        }
    }
}
