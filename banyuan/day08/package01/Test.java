package banyuan.day08.package01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * @author 陈浩
 * @date Created on 2019/10/31
 * 1.现在有学生类和学科类   学生类属性: 学生编号  学生姓名，学科类的属性:学科编号   学科名   学科成绩
 * 规定如下:   学科有 语文  数学  英语  物理 化学
 * 现在有n个学生，每个学生的每个学科都有成绩
 * a.现在要显示所有学生的所有的学科信息
 * b.根据每个学生的总成绩和进行降序排序
 * c.找出数学成绩前五的人的所有人信息和学科信息
 * d.将总成绩低于平均分的人，给他们的每个学科成绩各增加10分
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Subject> con = new ArrayList<>();
        List list = new ArrayList();
        Student stu = new Student();
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个学科编号:");
            String num = sc.next();
            System.out.println("请输入第" + (i + 1) + "个学科名称:");
            String name = sc.next();
            System.out.println("请输入第" + (i + 1) + "个学科成绩:");
            double dou = sc.nextDouble();
            con.add(new Subject(num, name, dou));
        }
        Object[] obj = con.toArray();

        for (int i = 0; i < 5; i++) {
            Collection<Subject> sub = (Collection<Subject>) obj[i];
            System.out.println("请输入第" + (i + 1) + "个学生的编号");
            String num = sc.next();
            stu.setStuNum(num);
            System.out.println("请输入第" + (i + 1) + "个学生的姓名");
            String name = sc.next();
            stu.setStuName(name);
            stu.setCon(sub);
            list.add(num);
            list.add(name);
            list.add(sub);
        }
        System.out.println(list);

    }


}





