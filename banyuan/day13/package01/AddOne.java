package banyuan.day13.package01;

/**
 * @author 陈浩
 * @date Created on 2019/11/7
 */
public class AddOne implements Runnable {

    Tools s;

    public AddOne(Tools s) {
        this.s = s;

    }

    @Override
    public void run() {
        while (true) {

            synchronized (s) {
                if (s.b == 1) {
                    System.out.println(Thread.currentThread().getName() + "加 1--->" + (++s.a));
                }

                s.b = 2;
                try {
                    s.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
