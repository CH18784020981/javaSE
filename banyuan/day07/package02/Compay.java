package banyuan.day07.package02;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 制作一个销售首饰的公司类。
 * 属性:
 * 一个保存员工的数组。
 * 方法：
 * 1, 添加一个员工。
 * 2,  通过员工的名字来删除员工。
 * 3,  通过员工的名字来显示员工的工资。
 * 4,  输出所有员工的工资和。
 */
public class Compay {
    String[] Person = new String[10];

    public Compay() {

    }


    public static void add() {

    }

    public Compay(String[] person) {
        Person = person;
    }

    public static void delete(String name) {

    }

    public static void search(String name) {

    }

    public static void payTheTotal() {
        double a = new XiaoShiGong().makeMoney(10, 200)
                + new XiaoShiGong().makeMoney(10, 230)
                + new XiaoShouYuanGong().makeMoney(5000, 4000)
                + new XiaoShouYuanGong().makeMoney(200000, 4000)
                + new PuTongYuanGong().makeMoney(205, 4000);
        double b = new GongRen().makeMoney(30, 50);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
    }

    public String[] getPerson() {
        return Person;
    }

    public void setPerson(String[] person) {
        Person = person;
    }
}
