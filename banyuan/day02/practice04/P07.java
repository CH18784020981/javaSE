package banyuan.day02.practice04;

import java.util.Scanner;

/*
定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。
 */
public class P07 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("请为数组输入十个整数：");
        for (int i = 0; i < arr.length; i++) {
            int input = in.nextInt();
            arr[i] = input;
        }
        System.out.println("请输入你要在数组中查找的数：");
        int input = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i]) {
                System.out.println(i);
            }
        }
        // System.out.println("查询不到");
    }

}

