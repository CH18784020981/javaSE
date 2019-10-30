package banyuan.day05.practice.p04;

public class Xiaoli extends Person implements Jiekou1 {
    @Override
    public void traffic() {
        System.out.print("坐火车");
    }

    @Override
    public void name() {
        System.out.print("小李");
    }
}
