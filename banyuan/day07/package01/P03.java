package banyuan.day07.package01;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 将字符串中指定部分进行反转。
 */
public class P03 {

    public static void main(String[] args) {
        String str = "你猜我是谁,你爸爸是我，我是你爸爸";
        StringBuffer ss = new StringBuffer();
        String a = str.substring(2, 8);

        ss.append(a);
        StringBuffer b = ss.reverse();
        System.out.println(str.substring(0, 2) + b + str.substring(8, str.length()));

    }
}
