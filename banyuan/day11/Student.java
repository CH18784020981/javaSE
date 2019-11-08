package banyuan.day11;

import java.io.Serializable;

/**
 * @author 陈浩
 * @date Created on 2019/11/5
 * 将一个集合里面的学生对象存储到指定的文件中去，每个学生信息单独占一行，学生的属性之间用英文逗号隔开
 * * 学生属性:学生编号 学生姓名 学生密码  学生年龄  学生班级
 */
public class Student implements Serializable, Comparable <Student>{
    private int stuNum;
    private String stuName;
    private String StuPassWord;
    private int stuAge;
    private String stuClass;

    public Student() {
    }

    public Student(int stuNum, String stuName, String stuPassWord, int stuAge, String stuClass) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        StuPassWord = stuPassWord;
        this.stuAge = stuAge;
        this.stuClass = stuClass;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPassWord() {
        return StuPassWord;
    }

    public void setStuPassWord(String stuPassWord) {
        StuPassWord = stuPassWord;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", stuName='" + stuName + '\'' +
                ", StuPassWord='" + StuPassWord + '\'' +
                ", stuAge=" + stuAge +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {

        return this.stuAge - o.stuAge;
    }
}

