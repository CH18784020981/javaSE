package banyuan.day09.package03.P04;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 4.某中学有若干学生(学生对象放在一个List中)，每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double) 
 * 某次考试结束后，每个学生都获得了一个考试成绩。遍历list集合，并把学生对象的属性打印出来
 */
public class Student {
    private String name;
    private String className;
    private double score;

    public Student() {
    }

    public Student(String name, String className, double score) {
        this.name = name;
        this.className = className;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
