package banyuan.day07.package02;

import banyuan.day06.p01.P;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 */
public class Test {
    public static void main(String[] args) {
        Compay compay = new Compay();
        compay.Person[0] = new XiaoShiGong(200, 10).toString();
        compay.Person[1] = new XiaoShiGong(230, 10).toString();
        compay.Person[2] = new XiaoShouYuanGong(5000, 4000).toString();
        compay.Person[3] = new XiaoShouYuanGong(2000000, 4000).toString();
        compay.Person[4] = new PuTongYuanGong(205, 4000).toString();
        compay.Person[5] = new GongRen(30, 50).toString();
        Compay.payTheTotal();
//        double a = new XiaoShiGong().makeMoney(10, 200)
//                + new XiaoShiGong().makeMoney(10, 230)
//                + new XiaoShouYuanGong().makeMoney(5000, 4000)
//                + new XiaoShouYuanGong().makeMoney(200000, 4000)
//                + new PuTongYuanGong().makeMoney(205, 4000);
//        double b = new GongRen().makeMoney(30, 50);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a + b);
        for (int i = 0; i < 6; i++) {
            System.out.println(compay.Person[i]);
        }
    }
}
