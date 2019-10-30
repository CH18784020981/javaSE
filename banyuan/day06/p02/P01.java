package banyuan.day06.p02;

/**
 * 1.给出一个随机字符串,判断有多少个字母？有多少个数字？
 *
 * @author 陈浩
 */
public class P01 {
    public static void main(String[] args) {
        String str = "a14bashjca12234987741";
        char arr[] = str.toCharArray();
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                temp1++;
            } else {
                temp2++;
            }

        }
        System.out.println("字母个数：" + temp2 + "  数字个数：" + temp1);

    }
}
