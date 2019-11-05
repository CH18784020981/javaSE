package banyuan.day07.package01;

import java.util.Scanner;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * ：请设计一个方法，可以实现获取任意范围内的随机数。
 */
public class P01 {
    public static int getRandom(int a, int b) {
        return ((int) (Math.random() * b) - (int) (Math.random() * a));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你想要的范围的随机数");
        int input = in.nextInt();
        int input2 = in.nextInt();
        System.out.println(getRandom(input, input2));

    }
}
