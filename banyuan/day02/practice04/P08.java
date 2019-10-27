package banyuan.day02.practice04;

/*
在一个数组中找出最大和最小值，并输出它们的位置
 */
public class P08 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 22, 44, 89, 0, -1};
        int max = arr[0];
        int min = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                j = i;
            }
        }

        System.out.println("arr[" + j + "]" + "=" + max);
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                j = i;
            }
        }
        System.out.println("arr[" + j + "]" + "=" + min);
    }
}
