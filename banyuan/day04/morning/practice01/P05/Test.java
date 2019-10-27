package banyuan.day04.morning.practice01.P05;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("陈浩");
        teacher.setHeight(1.7);
        teacher.setAge(34);
        teacher.setSex('男');
        teacher.setId(1123);
        System.out.println(teacher.ShowData());


    }
}
