package banyuan.day02.practice03;

import java.util.Scanner;

/*
请输入一个任意年份,判断是否是闰年
 */
public class P05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份：");
        int input = in.nextInt();
        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
            System.out.println(input + "年：是闰年");
        } else {
            System.out.println(input + "年：不是闰年");
        }

    }
}