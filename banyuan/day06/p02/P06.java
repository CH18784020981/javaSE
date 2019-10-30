package banyuan.day06.p02;

/**
 * 1.编程. 已知字符串：”this is a test of java”.
 * 按要求执行以下操作：
 * (1) 统计该字符串中字母s出现的次数
 * (2) 取出子字符串”test”
 * (3) 将本字符串复制到一个字符数组Char[] str中.
 * (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
 * (5) 用两种方式实现该字符串的倒叙输出。(用StringBuffer和for循环方式分别实现)
 * (6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的额英文单词,并输出到控制台
 *
 * @author 陈浩
 */
public class P06 {

    public static void main(String[] args) {
        String st = "this is a test of java";
        //将本字符串复制到一个字符数组Char[] str中.
        char[] str = st.toCharArray();
        //统计该字符串中字母s出现的次数
        int temp = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 's') {
                temp++;
            }
        }
        System.out.println(temp);
        //取出子字符串”test”
        System.out.println(st.substring(10, 14));

        String[] a = st.split(" ");
        //将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的额英文单词,并输出到控制台
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
        for (int j = 0; j < a.length; j++) {
            a[j] = a[j].substring(0, 1).toUpperCase() + a[j].substring(1);
            System.out.print(a[j] + " ");
        }
        System.out.println();
        //用两种方式实现该字符串的倒叙输出。(用StringBuffer和for循环方式分别实现)
        StringBuffer ss = new StringBuffer();
        ss.append(st);
        System.out.println(ss.reverse());


        for (int i = 0; i < str.length; i++) {
            System.out.print(str[str.length - i - 1]);
        }


    }
}
