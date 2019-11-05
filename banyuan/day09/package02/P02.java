package banyuan.day09.package02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SplittableRandom;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 2.使用Scanner从键盘读取一行输入,去掉其中重复字符,
 * 打印出不同的那些字符
 */
public class P02 {
    public static void main(String[] args) {
        Set set = new HashSet();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串");
        String input = in.next();
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        System.out.println(set);
    }
}
