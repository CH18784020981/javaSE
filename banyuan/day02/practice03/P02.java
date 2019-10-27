package banyuan.day02.practice03;

import java.util.Scanner;

/*
2.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
 */
public class P02 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("请输入你想要转化的10进制数：");
        int input = in.nextInt();
        String s = Integer.toBinaryString(input);
        System.out.println(s);
    }
}
