package banyuan.day09.package03.P02;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 编写一个类Book，具有name,price,press,author 然后创建5个对象
 * 放入ArrayList中，并实现按照price大小排序，
 * 然后遍历ArrayList输出每个Book对象, 使用toString 方法打印。
 */
public class Test {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Java", 90, "...", "tt"));
        list.add(new Book("C语言", 94, "...", "aa"));
        list.add(new Book("JDBC", 86, "...", "bb"));
        list.add(new Book("JSP", 22, "...", "cc"));
        list.add(new Book("C#", 100, "...", "dd"));
        sort(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

    }

    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Book obj1 = (Book) list.get(j);
                Book obj2 = (Book) list.get(j + 1);
                if (obj1.getPrice() > obj2.getPrice()) {
                    list.set(j, obj2);
                    list.set(j + 1, obj1);
                }
            }
        }
    }
}
