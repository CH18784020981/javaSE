package banyuan.day08.package01;

/**
 * @author 陈浩
 * @date Created on 2019/10/31
 * 1.现在有学生类和学科类   学生类属性: 学生编号  学生姓名，学科类的属性:学科编号   学科名   学科成绩
 * 规定如下:   学科有 语文  数学  英语  物理 化学
 * 现在有n个学生，每个学生的每个学科都有成绩
 * a.现在要显示所有学生的所有的学科信息
 * b.根据每个学生的总成绩和进行降序排序
 * c.找出数学成绩前五的人的所有人信息和学科信息
 * d.将总成绩低于平均分的人，给他们的每个学科成绩各增加10分
 */
public class Subject {

    private  String  subNum;
    private  String  subName;
    private  double score;

    public Subject(String subNum, String subName, double score) {
        this.subNum = subNum;
        this.subName = subName;
        this.score = score;
    }

    public Subject() {
    }

    public String getSubNum() {
        return subNum;
    }

    public void setSubNum(String subNum) {
        this.subNum = subNum;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subNum='" + subNum + '\'' +
                ", subName='" + subName + '\'' +
                ", score=" + score +
                '}';
    }
}
