package banyuan.day02.practice05;

import java.util.Scanner;

/*
数据加密问题
		某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
		在传递过程中需要加密，加密规则如下：
			首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
			最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
			然后，把加密后的结果在控制台打印出来
 */
public class p02 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = 0;
        int input;

        input = in.nextInt();
        int[] arr = new int[0];

        while (input != 0) {

            arr = addArrLength(arr);
            arr[i++] = input % 10;
            input /= 10;
        }

        for (i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        arr[0] = arr[0] + arr[arr.length - 1];
        arr[arr.length - 1] = arr[0] - arr[arr.length - 1];
        arr[0] = arr[0] - arr[arr.length - 1];

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static int[] addArrLength(int[] arr) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];
        }
        return newArr;
    }
}

