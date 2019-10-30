package banyuan.day02.practice05;

import java.util.Scanner;

/**
 * @author newpc
 * <p>
 * 1.你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
 * 输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
 * 输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
 */
public class P01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[0];
        int i = 0;
        int input;

        do {
            input = sc.nextInt();

            if (input == -1) break;

            if (input >= 0 && input <= 10000) {
                arr = addArrLength(arr);
                arr[i++] = input;
            }

        } while (input != -1);

        int n1 = 0;
        int n2 = 0;

        for (i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {
                n1++;
            } else n2++;
        }
        System.out.println(n1 + " " + n2);
    }

    public static int[] addArrLength(int[] arr) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];
        }
        return newArr;
    }
}
