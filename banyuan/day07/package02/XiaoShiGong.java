package banyuan.day07.package02;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 */
public class XiaoShiGong implements YuanGong {
    private double time;
    private double money;

    public XiaoShiGong() {
    }

    public XiaoShiGong(double time, double money) {
        this.time = time;
        this.money = money;
    }

    @Override
    public double makeMoney(double money, double time) {
        return money * time;
    }


    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "XiaoShiGong{" +
                "time=" + time +
                ", money=" + money +
                '}';
    }
}
