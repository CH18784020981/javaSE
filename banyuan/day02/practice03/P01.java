package banyuan.day02.practice03;

import java.util.Scanner;

/*
1.从键盘输入一个班5个学生的分数，求和并输出
 */
public class P01 {

    public static double sum(double a, double b, double c, double d, double e) {

        return (a + b + c + d + e);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入5个学生的分数");
        System.out.println("第1名学生");
        double a = in.nextDouble();
        System.out.println("第2名学生");
        double b = in.nextDouble();
        System.out.println("第3名学生");
        double c = in.nextDouble();
        System.out.println("第4名学生");
        double d = in.nextDouble();
        System.out.println("第5名学生");
        double e = in.nextDouble();
        System.out.println("它们的和为");
        System.out.println(sum(a, b, c, d, e));


    }

}
