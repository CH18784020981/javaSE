package banyuan.day04.afterNoon.practice01.P01;

/*
现有学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
        和试题类（试题编号number,试题内容title,试题答案 anwserA  anwserB anwserC anwserD ），
        其中一个学生（有6个）登录账号进行考试,
        在控制台随机显示题目,并且输入题目的正确答案才会有分数,每题5分,现在有30个题目(题目自己出,不做要求)。
        求学生考完试在控制台最终得到的分数

 */
public class TestQuestions {
    private int number;
    private String title;
    private String anwter;

    public TestQuestions() {
    }

    public TestQuestions(int number, String title, String anwter) {
        this.number = number;
        this.title = title;
        this.anwter = anwter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TestQuestions{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", anwter='" + anwter + '\'' +
                '}';
    }
}
