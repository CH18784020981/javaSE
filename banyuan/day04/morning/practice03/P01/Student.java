package banyuan.day04.morning.practice03.P01;

/*
现有学生和班级两个类
学生属性有:
姓名,年龄,学生编号,班级
班级：
班级名称,班级编号

现在在一个工具类 Tool
里面有一个方法用来查找在三个不同班级里面的学生重名的功能
 每个班级10个学生,如果查到学生姓名有一样的,
 这个方法就返回所有的学生对象并且输出满足条件对象信息
 */
public class Student {
    private String name;
    private int num;
    //private Class []class1;

    public Student() {
    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
        ///this.class1 = class1;
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

//    public Class[] getClass1() {
//        //return class1;
//    }

//    public void setClass1(Class []class1) {
//       // this.class1 = class1;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                //", class=" + class1 +
                '}';
    }
}
