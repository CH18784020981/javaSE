package banyuan.day04.morning.practice01.P04;

public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setX(10);
        tank.setY(50);
        tank.setDir("右");
        tank.setType("重型坦克");
        System.out.println(tank.toString());
    }
}
