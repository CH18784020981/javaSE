package banyuan.day12;

/**
 * @author 陈浩
 * @date Created on 2019/11/6
 */
public class TestP01 {
    public static void main(String[] args) {
        P01 m = new P01();
        Thread s1 = new Thread(m);
        s1.setName("A");
        Thread s2 = new Thread(m);
        s2.setName("B");
        s1.start();
        s2.start();
    }
}
