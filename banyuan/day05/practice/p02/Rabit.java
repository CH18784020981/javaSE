package banyuan.day05.practice.p02;

/**
 * 编写程序描述兔子和青蛙 需求说明：
 * 使用面向对象的思想，设计自定义类描述兔子和青蛙
 *
 * @author 陈浩
 */
public class Rabit {
    private String name;

    public Rabit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Rabit(String name, int num) {
        this.name = name;
        this.num = num;
    }

    private int num;

    public void eat() {

    }

    public void sleep() {
    }
}