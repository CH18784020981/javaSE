package banyuan.day02.practice04;

/**
 * 输入10个整数存入数组，然后复制到b数组中输出
 *
 * @author newpc
 */
public class P05 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 22, 44, 89, 0, -1};
        int[] arr1 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
