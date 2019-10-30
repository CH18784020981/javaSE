package banyuan.day06.p03;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 1."23 9 -4 18 100 7"中间是 空格
 * 要求这串数字按照从小到大排序并生成一个数值有序的字符串
 * 思路：将每个数字依次提取出来到一个数组中去，排序后变成一个新字符串，最后输出出来
 */

public class P01 {
    public static void main(String[] args) {
        String str = "23 9 -4 18 100 7";
        //通过" "将字符串转化为字符串数组
        String[] a = str.split(" ");
        //将字符串数组转化为int型数组
        int[] b = new int[6];
        for (int j = 0; j < a.length; j++) {
            b[j] = Integer.valueOf(a[j]);

        }
        //冒泡排序升序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;

                }


            }

        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
