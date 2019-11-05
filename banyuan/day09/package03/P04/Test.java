package banyuan.day09.package03.P04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 4.某中学有若干学生(学生对象放在一个List中)，每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double) 
 * 某次考试结束后，每个学生都获得了一个考试成绩。遍历list集合，并把学生对象的属性打印出来
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("刘国泰", "01", 90));
        list.add(new Student("刘国泰2", "02", 44));
        list.add(new Student("刘国泰4", "03", 33));
        list.add(new Student("刘国泰9", "04", 44));

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
