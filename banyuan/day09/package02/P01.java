package banyuan.day09.package02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 1.编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 并把最终的随机数输出到控制台
 */
public class P01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Random a = new Random();
        int bound = 20;
        int len = 10;
        while (set.size() < len) {
            int b = a.nextInt(bound);
            set.add(b);
        }
        Object[] m = set.toArray();
        for (Object n : m) {
            System.out.println(n);
        }
        System.out.println(set);
    }
}
