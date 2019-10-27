package banyuan.day04.afterNoon.practice01.P01;

import java.util.Scanner;

public class tool {

    public static void main(String[] args) {
        Student[] stu = new Student[6];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(i + 1, "陈浩" + i, 1, 0);
        }
        TestQuestions[] test = new TestQuestions[30];
        for (int i = 0; i < test.length; i++) {
            test[i] = new TestQuestions(i + 1, ".试题" + (i + 1), "A B C D");
        }

        /*
        学生选择
         */
        System.out.println("请选择学生编号");
        Scanner in1 = new Scanner(System.in);
        int input1 = in1.nextInt();
        for (int i = 0; i < stu.length; i++) {
            if (input1 == stu[i].getStuNum()) {
                System.out.println(stu[i].toString());
            }
        }

        /*
        试题
         */
        Scanner in = new Scanner(System.in);

        int score = 0;

        int b = -1;
        int a;
        for (int i = 0; i < 10; i++) {


            a = (int) (Math.random() * 29);
            if (b == a) {
                a = (int) (Math.random() * 29);
                System.out.println(test[a].toString());

            }
            if (a != b) {
                System.out.println(test[a].toString());
                b = a;

            }

            System.out.println("请输入选项 A B C D");
            String input = in.next();
            if (input.equals("A")) {
                score += 5;
            }

        }
        stu[input1].setStuScore(score);
        System.out.println(stu[input1].toString());
    }
}
