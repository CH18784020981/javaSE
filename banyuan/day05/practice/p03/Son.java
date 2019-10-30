package banyuan.day05.practice.p03;

public class Son extends Father implements Jiekou1, Jiekou2 {
    private String name;
    private int age;
    private int num;

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void study() {
        System.out.println("学习");
    }
}
