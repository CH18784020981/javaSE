package banyuan.day12;

/**
 * @author 陈浩
 * @date Created on 2019/11/6
 */
public class P02 extends Thread {
    boolean flag;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (true) {
            if (flag) {
                synchronized (Tools.o1) {
                    System.err.println("T.T日了🐶");
                    synchronized (Tools.o2) {
                        System.err.println("T.T日了🐷");

                    }
                }

            } else {
                synchronized (Tools.o2) {
                    System.err.println("T.T日了🐶");
                    synchronized (Tools.o1) {
                        System.err.println("T.T日了🐷");

                    }
                }
            }
        }

    }
}
