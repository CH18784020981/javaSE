package banyuan.day09.package02;

import java.util.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 3.键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)
 * ,按照总分从高到低输出到控制台
 * 注意这个题用TreeSet见P03_2
 */
public class P03 {
    public static void main(String[] args) {
        Set set = new HashSet();
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
        List list = new ArrayList();


        Iterator it = set.iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
        sort(list);
        Iterator it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

    }

    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Student obj1 = (Student) list.get(j);
                Student obj2 = (Student) list.get(j + 1);
                if (obj1.getSumScore() < obj2.getSumScore()) {

                    list.set(j, obj2);
                    list.set(j + 1, obj1);
                }
            }
        }
    }
}


