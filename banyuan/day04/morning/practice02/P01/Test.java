package banyuan.day04.morning.practice02.P01;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student(123, "读者", "男");
        Student stu2 = new Student(345, "陈浩", "男", 124);
        System.out.println(stu1.toString2());
        System.out.println(stu2.toString());

    }
}
