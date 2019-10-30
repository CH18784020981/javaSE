package banyuan.day02.practice03;

import java.util.Scanner;

/**
 * 输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
 * @author newpc
 */
public class P07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入正整数");
        int input = in.nextInt();

        while (input > 0) {
            System.out.print(input % 10);
            input /= 10;
        }

    }
}
