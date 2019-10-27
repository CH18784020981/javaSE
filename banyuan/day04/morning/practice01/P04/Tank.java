package banyuan.day04.morning.practice01.P04;

/*
 定义一个Tank类(坦克类)，为其定义x（横坐标），y（纵坐标），dir（方向：值为上下左右），Type（类型）4个属性，其访问修饰符均为公有；
 为Tank类定义一个构造方法实现4个字段的初始化
 为Tank类定义一个ShowData方法，控制台打印4个字段值
 创建一个Tank对象，横坐标为10，纵坐标为50，方向为右，类型为重型坦克，并通过调用对象的ShowData()方法打印Tank信息
 */
public class Tank {
    public double x;
    public double y;
    public String dir;
    public String Type;

    public Tank() {
    }

    public Tank(double x, double y, String dir, String type) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        Type = type;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        if (dir.equals("上") || dir.equals("下") || dir.equals("左") || dir.equals("右"))
            this.dir = dir;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", dir='" + dir + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
