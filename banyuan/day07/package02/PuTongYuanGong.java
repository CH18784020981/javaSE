package banyuan.day07.package02;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 */
public class PuTongYuanGong implements YuanGong {
    private double time;
    private double jiBenGongZhi;


    public PuTongYuanGong() {
    }

    public PuTongYuanGong(double time, double jiBenGongZhi) {
        this.time = time;
        this.jiBenGongZhi = jiBenGongZhi;
    }

    @Override
    public double makeMoney(double time, double jiBenGongZhi) {
        if (time>=196){
            return jiBenGongZhi+(time-196)*200;
        }else {
            return jiBenGongZhi;
        }

    }


    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getJiBenGongZhi() {
        return jiBenGongZhi;
    }

    public void setJiBenGongZhi(double jiBenGongZhi) {
        this.jiBenGongZhi = jiBenGongZhi;
    }

    @Override
    public String toString() {
        return "PuTongYuanGong{" +
                "time=" + time +
                ", jiBenGongZhi=" + jiBenGongZhi +
                '}';
    }
}
