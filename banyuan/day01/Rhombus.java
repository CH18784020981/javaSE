package banyuan.day01;
/**
 * 设计一个程序输出菱形
 */

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入高度");
        int input = in.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = input - 1; i >= 1; i--) {
            for (int k = input - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}

