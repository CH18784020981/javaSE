package banyuan.day02.practice04;

import java.util.Scanner;

/*
1.任意输入 n行 n列的乘法口诀表
        */
public class P01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入 n行 n列的乘法口诀表");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+"*"+j+"=" + i * j+"    ");

            }
            System.out.println();
        }
    }
}
