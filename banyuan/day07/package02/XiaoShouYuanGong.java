package banyuan.day07.package02;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 */
public class XiaoShouYuanGong implements YuanGong {
    private double zongJingE;
    private double jiBenGongZhi;


    public XiaoShouYuanGong() {
    }

    public XiaoShouYuanGong(double zongJingE, double jiBenGongZhi) {
        this.zongJingE = zongJingE;
        this.jiBenGongZhi = jiBenGongZhi;
    }

    @Override
    public double makeMoney(double zongJingE, double jiBenGongZhi) {
        if (zongJingE < 10000) {
            return (int) (zongJingE * 0.1 + jiBenGongZhi);
        } else if (zongJingE >= 10000 && zongJingE < 100000) {
            return (zongJingE * 0.15 + jiBenGongZhi);
        } else {
            return (int) (zongJingE * 0.18 + jiBenGongZhi);
        }

    }


    public double getZongJingE() {
        return zongJingE;
    }

    public void setZongJingE(double zongJingE) {
        this.zongJingE = zongJingE;
    }

    public double getJiBenGongZhi() {
        return jiBenGongZhi;
    }

    public void setJiBenGongZhi(double jiBenGongZhi) {
        this.jiBenGongZhi = jiBenGongZhi;
    }

    @Override
    public String toString() {
        return "XiaoShouYuanGong{" +
                "zongJingE=" + zongJingE +
                ", jiBenGongZhi=" + jiBenGongZhi +
                '}';
    }
}
