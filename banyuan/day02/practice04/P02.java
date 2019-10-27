package banyuan.day02.practice04;

import java.util.Scanner;

/*
2.输入三个班，每班10个学生的成绩，求每个班的总分和平均分
 */
public class P02 {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;

        int[][] student = new int[3][10];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {

            for (int j = 0; j < student[0].length; j++) {
                int input = in.nextInt();
                student[i][j] = input;
            }
        }
        for (int i = 0; i < 3; i++) {


            for (int j = 0; j < student[0].length; j++) {
                sum += student[i][j];
            }
            avg = sum / 10;
            System.out.println(sum);
            System.out.println(avg);
        }
    }
}
