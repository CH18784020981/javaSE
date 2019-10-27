package banyuan.day04.morning.practice03.P01;

import java.util.Scanner;

public class Tool {
    public static void main(String[] args) {
        // Student[] students = new Student[10];
        Class[] classes = new Class[3];


        classes[0] = new Class("1班", 1);
        classes[1] = new Class("2班", 2);
        classes[2] = new Class("3班", 3);
        classes[0].students = new Student[10];
        classes[1].students = new Student[10];
        classes[2].students = new Student[10];
        for (int i = 0; i < classes.length; i++) {
            for (int j = 0; j < classes[i].students.length - 1; j++) {
                classes[i].students[j] = new Student("亨利" + j, 0 + j);
            }
        }
        for (int i = 0; i < classes.length; i++) {

            classes[i].students[classes[i].students.length - 1] = new Student("亨利", 0 + classes[i].students.length - 1);

        }


        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要查询的学生姓名");
        String input = in.next();


        for (int j = 0; j < classes[0].students.length; j++) {
            if (input.equals(classes[0].students[j].getName()) && classes[0].students[j].getName().equals(classes[1].students[j].getName())) {
                System.out.println(classes[0].students[j].toString() + classes[0].toString());
            }
        }
        for (int j = 0; j < classes[1].students.length; j++) {
            if (input.equals(classes[1].students[j].getName()) && classes[1].students[j].getName().equals(classes[2].students[j].getName())) {
                System.out.println(classes[1].students[j].toString() + classes[1].toString());
            }
        }
        for (int j = 0; j < classes[1].students.length; j++) {
            if (input.equals(classes[2].students[j].getName()) && classes[2].students[j].getName().equals(classes[0].students[j].getName())) {
                System.out.println(classes[1].students[j].toString() + classes[2].toString());
            }
        }

    }
}
