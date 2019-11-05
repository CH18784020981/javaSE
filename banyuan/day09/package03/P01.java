package banyuan.day09.package03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 1.分析以下需求，并用代码实现：
 * (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 * (2)编写方法对List集合进行排序
 * (2)然后利用迭代器遍历集合元素并输出
 * (3)如：15 18 20 40 46 60 65 70 75 91
 */
public class P01 {
    public static void main(String[] args) {
        int m = 99;
        int a;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int n = 10;
        int[] arr2 = new int[10];
        for (int i = 0; i < n; i++) {
            a = (int) (Math.random() * m);
            arr2[i] = arr[a];
            arr[a] = arr[m];
            m--;

        }

        List list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(arr2[i]);
        }
        sort(list);
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }

    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Object obj1 = list.get(i);
                int i1 = (int) obj1;
                Object obj2 = list.get(j);
                int i2 = (int) obj2;
                if (i1 > i2) {
                    list.set(i, list.get(j));
                    list.set(j, obj1);

                }
            }
        }
    }
}