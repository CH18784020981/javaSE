package banyuan.day06.p03;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 去除给定的数组中的重复字符（重复字符只保留一个）
 */
public class Test2 {
    public static void main(String[] args) {
        char[] a = {'1', '3', '1', '8', '4', '4', '2', '2', '3', '0', 'a', 'a', 'b', 'b'};
        for (int i = 0; i < a.length; i++) {
            // 0表示不存在
            int exist = 0;

            // 判断一个数是否和前面的数重复
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    exist = 1;
                    break;
                }
            }
            //不重复的话就输出
            if (exist == 0) {
                System.out.print(a[i]);
            }

        }

    }
}
