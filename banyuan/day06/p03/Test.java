package banyuan.day06.p03;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 去除给定的参数字符串中的重复字符（重复字符只保留一个）
 */
public class Test {
    public static void main(String[] args) {
        char[] ch = {'1', '2', '2', '1', '4', '4', '4', '2', '2', '3', '3', '1', '0'};
        StringBuffer a = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            char b = ch[i];
            if (!a.toString().contains(b + "")) {
                a.append(b);
            }
        }
        System.out.println(a.toString());
    }
}

