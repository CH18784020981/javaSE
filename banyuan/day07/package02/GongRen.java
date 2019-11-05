package banyuan.day07.package02;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 */
public class GongRen implements YuanGong {
    private double num;
    private double gongZhi;

    public GongRen(int num, int gongZhi) {
        this.num = num;
        this.gongZhi = gongZhi;
    }

    public GongRen() {
    }

    @Override
    public double makeMoney(double num, double gongZhi) {
        return num*gongZhi;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getGongZhi() {
        return gongZhi;
    }

    public void setGongZhi(double gongZhi) {
        this.gongZhi = gongZhi;
    }

    @Override
    public String toString() {
        return "GongRen{" +
                "num=" + num +
                ", gongZhi=" + gongZhi +
                '}';
    }
}
