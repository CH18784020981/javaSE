package banyuan.day13.package01;

/**
 * @author 陈浩
 * @date Created on 2019/11/7
 */
public class RedOne implements Runnable {
    Tools s;

    public RedOne(Tools s) {
        this.s = s;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                if (s.b == 2) {
                    System.out.println(Thread.currentThread().getName() + "减 1--->" + (--s.a));

                }

                s.b = 1;
                try {
                    s.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
