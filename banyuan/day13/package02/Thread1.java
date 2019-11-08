package banyuan.day13.package02;

/**
 * @author 陈浩
 * @date Created on 2019/11/7
 */
public class Thread1 implements Runnable {
    Tools s;

    public Thread1(Tools s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                if (s.a < 'z') {
                    if (s.b == 1) {
                        for (int i = 0; i < 4; i++) {
                            System.out.println(Thread.currentThread().getName() + "===>" + (s.a++));
                        }
                        s.b = 2;
                    }
                }
                try {
                    s.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
