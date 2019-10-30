package banyuan.day02.practice03;

import java.util.Scanner;

/**
 * @author newpc
 * <p>
 * 输入一批整数，使用循环求出最大值与最小值，输入0时结束。
 */
public class P03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入第一个数:");

        int input = in.nextInt();

        int max, min;

        max = input;
        min = input;

        for (int i = 2; input != 0; i++) {
            System.out.println("请输入第" + i + "个数：");
            input = in.nextInt();
            if (input != 0) {
                if (input > max) {
                    max = input;
                } else {
                    min = input;
                }
            }
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);

    }
}
