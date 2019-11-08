package banyuan.day13.package02;

/**
 * @author 陈浩
 * @date Created on 2019/11/7
 */
public class Test {
    public static void main(String[] args) {
        Tools t = new Tools();
        Thread1 th1 = new Thread1(t);
        Thread2 th2 = new Thread2(t);
        Thread3 th3 = new Thread3(t);

        Notify no = new Notify(t);

        Thread m1 = new Thread(th1);
        Thread m2 = new Thread(th2);
        Thread m3 = new Thread(th3);

        Thread n = new Thread(no);

        m1.start();
        m2.start();
        m3.start();

        n.start();


    }
}
