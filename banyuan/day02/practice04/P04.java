package banyuan.day02.practice04;

/*
定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
 */
public class P04 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 22, 44, 89, 0, -1};
        int max = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                j = i;
            }
        }
        System.out.println("arr[" + j + "]" + "=" + max);

    }
}
