package banyuan.day12;

/**
 * @author 陈浩
 * @date Created on 2019/11/6
 */
public class TestP02 {
    public static void main(String[] args) {
        P02 a = new P02();
        a.setFlag(true);
        P02 b = new P02();
        b.setFlag(false);
        a.start();
        b.start();

    }
}
