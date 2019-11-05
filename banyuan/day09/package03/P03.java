package banyuan.day09.package03;

import java.util.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 3.把如下元素存入List集合
 * “aaa” “bbb” “aaa” “abc”“xyz” “123” “xyz”
 * 去掉重复元素
 */
public class P03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("abc");
        list.add("xyz");
        list.add("123");
        list.add("xyz");
        Iterator it = list.iterator();
        Set set = new HashSet();
        while (it.hasNext()) {
            set.add(it.next());
        }
        System.out.println(set);
        Iterator it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }

}

