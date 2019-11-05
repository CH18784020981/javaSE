package banyuan.day09.package02;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 */
public class P03_2 {
    public static void main(String[] args) {
        Set set = new TreeSet();
        Scanner in = new Scanner(System.in);
        int len = 5;
        for (int i = 0; i < len; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
            String input = in.next();
            System.out.println("请输入第" + (i + 1) + "个学生的语文成绩：");
            int input1 = in.nextInt();
            System.out.println("请输入第" + (i + 1) + "个学生的数学成绩：");
            int input2 = in.nextInt();
            System.out.println("请输入第" + (i + 1) + "个学生的英语成绩：");
            int input3 = in.nextInt();
            set.add(new Student(input, input1, input2, input3));
        }
        for (Object o : set) {
            System.out.println(o);
        }

    }
}
