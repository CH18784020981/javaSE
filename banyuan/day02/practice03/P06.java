package banyuan.day02.practice03;

import java.util.Scanner;

/*
30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数
 */
public class P06 {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        int count = 0;
        int no = type.nextInt();
        for (int i = 0; i < 10; i++) {
            if (no == 30 * Math.random()) {
                count++;
            }
        }
        System.out.println(count);
    }

}
