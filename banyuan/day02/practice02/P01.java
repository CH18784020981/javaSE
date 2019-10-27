package banyuan.day02.practice02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        System.out.println(((X % 2) == 0) ? "偶数" : "奇数");
    }
}
