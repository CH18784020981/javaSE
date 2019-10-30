package banyuan.day05.practice.p04;

public class Xiaoming extends Person implements Jiekou1 {

    @Override
    public void traffic() {
        System.out.print("坐大巴");
    }

    @Override
    public void name() {
        System.out.print("小明");
    }
}
