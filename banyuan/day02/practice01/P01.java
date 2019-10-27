package banyuan.day02.practice01;

import java.util.Scanner;
/*
1.手动输入任意三个数，求三个数的和，差
 */
public class P01 {
    public static double sum(double a, double b, double c) {
        return (a + b + c);
    }

    public static double reduction(double a, double b, double c) {
        return (a - b - c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三个数字");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.println("之和");
        System.out.println(sum(a, b, c));
        System.out.println("之差");
        System.out.println(reduction(a, b, c));

    }
}
