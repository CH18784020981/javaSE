package banyuan.day02.practice03;

import java.util.Scanner;

/*
找出能被5或6整除，但不能被两者同时整除的数
 */
public class P04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字：");
        int input = in.nextInt();
        if ((input % 6 == 0 || input % 5 == 0) && input % 30 != 0) {
            System.out.println("这个数能被5或6整除，但不能被两者同时整除的数");
            System.out.println(input);
        } else {
            System.out.println("这个数不满足：能被5或6整除，但不能被两者同时整除的数");
        }
    }
}
