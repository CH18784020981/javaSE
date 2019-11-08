package banyuan.day12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈浩
 * @date Created on 2019/11/6
 * 一个账户 1000块钱 :两个人 A B  分别在柜台和ATM机 取钱  A每次取钱100  B每次取200   最终在控制台输出每个人取钱数
 */
public class P01 implements Runnable {


    static int money = 1000;
    static int sum1, sum2;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        int con1 = 0;
        int con2 = 0;

        while (true) {
            //lock.lock();
            synchronized (this) {
                if (money > 0) {
                    if (Thread.currentThread().getName().equals("B") && money >= 200) {
                        System.out.println(Thread.currentThread().getName() + "取得了200");
                        money = money - 200;
                        con1++;
                        sum1 = 200 * con1;

                    }
                    if (Thread.currentThread().getName().equals("A") && money >= 100) {
                        System.out.println(Thread.currentThread().getName() + "取得了100");
                        money = money - 100;
                        con2++;
                        sum2 = 100 * con2;

                    }

                }

//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                System.out.println("卡里还剩：" + (1000 - sum1 - sum2));
                if (money <= 0) {
                    break;
                }

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //lock.unlock();
        }
        System.out.println("A取了：" + sum2);
        System.out.println("B取了：" + sum1);
    }
}
