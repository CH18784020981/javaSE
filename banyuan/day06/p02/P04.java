package banyuan.day06.p02;

/**
 * 4.编写一个程序，设定一个有大小写和以及非大小写的字符串
 * 分别统计大小写的字符的个数和非大小写字符的个数，并且分别把大小写字符和非大小写字符输出字符串
 *
 * @author 陈浩
 */
public class P04 {
    public static void main(String[] args) {
        String str = "ABJaaDJKCabFAshc1212@#adFg$%^!@#$%";
        char[] arr = str.toCharArray();
        int[] temp = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                temp[0]++;
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                temp[1]++;
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] >= 'a' && arr[i] <= 'z') && !(arr[i] >= 'A' && arr[i] <= 'Z')) {
                temp[2]++;
                System.out.print(arr[i]);
            }

        }
        System.out.println("\n大写字母个数：" + temp[0] + "\n 小写字母个数" + temp[1] + " \n非大小写字母个数" + temp[2]);
    }
}
