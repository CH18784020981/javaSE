package banyuan.day04.morning.practice02.P02;

/*
创建一个Rectangle类。
该类拥有属性length和width，
每个属性的默认值均为1。该类拥有方法perimeter和area，
分别用于计算矩形的周长和面积。
该类还有设置和读取属性length和width的方法。并测试Rectangle类的使用。 
 */
public class Rectangle {
    private int lenght = 1;
    private int width = 1;

    public Rectangle() {
    }

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerimeter(int height, int width) {
        return (height + width) * 2;
    }

    public int getArea(int height, int width) {
        return height * width;
    }
}
