package banyuan.day04.morning.practice02.P02;

public class test {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.setLenght(18);
        re.setWidth(19);
        System.out.println(re.getPerimeter(re.getWidth(), re.getLenght()));
        System.out.println(re.getArea(re.getWidth(), re.getLenght()));
    }
}
