package banyuan.day05.practice.p04;

/**
 * @author newpc
 */
public class Xiaowang extends Person implements Jiekou1 {
    @Override
    public void traffic() {
        System.out.print("坐灰机");
    }

    @Override
    public void name() {
        System.out.print("小王");
    }
}
