package banyuan.day08.package02;


import sun.tools.tree.ShiftRightExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author 陈浩
 * @date Created on 2019/10/31
 * Person 类 属性   身份编号    年龄     姓名  住址   性别
 * 现在有男女不同的N个人   分别住在 地址格式为：苏州xxx区  上海XXX区  南京xxx区  镇江xxx区  常州xxx区
 * 每个地方的人数不限
 * 1.将不同地区的n个人存储到集合中去
 * 2.根据手动输入的城市名称显示所有的该市的人员信息
 * 3.删除集合中指定市指定区的所有成员
 * 4.现在xxx市发布了一条新规定 只要住在该市的 该城市下的所有人员的身份编号后都必须加该市的
 * 拼音
 * 如: 身份编号:9527 -----> 9527shanghai
 */
public class Test {
    public static void main(String[] args) {
//        Person[] person = new Person[10];
//        person[0] = new Person("01", 11, "陈一", "苏州1区", "男");
//        person[1] = new Person("02", 12, "陈二", "上海1区", "男");
//        person[2] = new Person("03", 13, "陈三", "南京1区", "男");
//        person[3] = new Person("04", 14, "陈四", "镇江1区", "男");
//        person[4] = new Person("05", 15, "陈五", "常州1区", "男");
//        person[5] = new Person("06", 16, "陈六", "上海2区", "男");
        Collection son = new ArrayList();
        son.add(new Person("01shuzhou", 11, "陈一", "苏州1区", "男"));
        son.add(new Person("02shanghai", 12, "陈二", "上海1区", "男"));
        son.add(new Person("03nanjing", 13, "陈三", "南京1区", "男"));
        son.add(new Person("04zhenjiang", 14, "陈四", "镇江1区", "男"));
        son.add(new Person("05changzhou", 15, "陈五", "常州1区", "男"));
        son.add(new Person("06shanghai", 16, "陈六", "上海2区", "男"));
        Object[] a = son.toArray();

        Scanner in = new Scanner(System.in);
        System.out.println("输入查询城市");
        String input = in.next();
        for (int i = 0; i < a.length; i++) {
            Person p = (Person) a[i];
            if (input.equals(p.getAddress().substring(0, 2))) {
                System.out.println(p.toString());
            }
        }
        System.out.println("输入查询城市");
        input = in.next();
        for (int i = 0; i < a.length; i++) {
            Person p = (Person) a[i];
            if (input.equals(p.getAddress().substring(0, 2))) {
                son.remove(p);
            }
        }
        System.out.println(son);
        String at = "aaa";
        at = "109j  ";
    }
}

