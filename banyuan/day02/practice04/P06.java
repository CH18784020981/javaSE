package banyuan.day02.practice04;

import java.util.Scanner;

/*
声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
 */
public class P06 {
    public static void main(String[] args) {

        double sum = 0;
        double avg = 0;
        int max;
        int min;
        int[] arr = new int[8];
        Scanner in = new Scanner(System.in);
        System.out.println("请依次输入8名学生的成绩：");
        for (int i = 0; i < arr.length; i++) {
            int input = in.nextInt();
            arr[i] = input;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("sum=" + sum + "avg=" + avg + "min=" + min + "max=" + max);
    }
}
