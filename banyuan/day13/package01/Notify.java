package banyuan.day13.package01;

/**
 * @author 陈浩
 * @date Created on 2019/11/7
 */
public class Notify implements Runnable {
    Tools s;

    public Notify(Tools s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                s.notify();
            }
        }
    }
}
