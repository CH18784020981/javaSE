package banyuan.day04.afterNoon.practice01.P01;

/*现有学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
        和试题类（试题编号number,试题内容title,试题答案 anwserA  anwserB anwserC anwserD ），
        其中一个学生（有6个）登录账号进行考试,
        在控制台随机显示题目,并且输入题目的正确答案才会有分数,每题5分,现在有30个题目(题目自己出,不做要求)。
        求学生考完试在控制台最终得到的分数

 */
public class Student {
    private int stuNum;
    private String stuName;
    private int stuGrade;
    private int stuScore;

    public Student() {
    }

    public Student(int stuNum, String stuName, int stuGrade, int stuScore) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
        this.stuScore = stuScore;
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

    public int getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", stuName='" + stuName + '\'' +
                ", stuGrade=" + stuGrade +
                ", stuScore=" + stuScore +
                '}';
    }
}
