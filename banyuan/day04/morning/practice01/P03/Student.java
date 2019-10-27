package banyuan.day04.morning.practice01.P03;

/*
1) 创建一个学生类
 2) 创建四个私有的字段:name,sex,age,dire
 3) 分别为私有的字段提供属性:name长度不能超过四位,sex只能是男或女,age 1-60,dire方向只能是.net或java
 4) 测试:创建学生对象，设置属性，再分别在控制台打印该学生的基本信息
 */
public class Student {
    private String name;
    private char sex;
    private int age;
    private String dir;

    public Student() {
    }

    public Student(String name, char sex, int age, String dir) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.dir = dir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 4)
            this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == '男' || sex == '女')
            this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 60)
            this.age = age;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        if (dir.equals(".net") || dir.equals("java"))
            this.dir = dir;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", dir='" + dir + '\'' +
                '}';
    }
}
