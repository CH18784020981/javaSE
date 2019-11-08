package banyuan.day13.package01;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 陈浩
 * @date Created on 2019/11/7
 * 1. 四个线程 其中A,B线程对每次对i增加1  C.D线程每次对i减1
 */
public class Test {
    public static void main(String[] args) {
        Tools t = new Tools();
        Notify n = new Notify(t);

        AddOne a = new AddOne(t);
        RedOne r = new RedOne(t);
        RedOne r2 = new RedOne(t);
        AddOne a2 = new AddOne(t);

//        ExecutorService es = Executors.newFixedThreadPool(2);
//        ExecutorService es2 = Executors.newFixedThreadPool(2);
//        es.submit(a);
//        es.submit(a2);
//        es2.submit(r);
//        es2.submit(r2);


        Thread th1 = new Thread(a);

        Thread th2 = new Thread(r);
        Thread th4 = new Thread(r2);
        Thread th3 = new Thread(a2);
        Thread th5 = new Thread(n);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        th5.start();

    }
}
