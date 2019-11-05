package banyuan.day09.package02;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * 3.键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)
 * ,按照总分从高到低输出到控制台
 */
public class Student implements Comparable {
    private String name;
    private int ChineseScore;
    private int mathScore;
    private int EnglishScore;

    public Student() {
    }

    public Student(String name, int chineseScore, int mathScore, int englishScore) {
        this.name = name;
        ChineseScore = chineseScore;
        this.mathScore = mathScore;
        EnglishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        EnglishScore = englishScore;
    }

    public int getSumScore() {
        return EnglishScore + mathScore + ChineseScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ChineseScore=" + ChineseScore +
                ", mathScore=" + mathScore +
                ", EnglishScore=" + EnglishScore +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        int result = -(this.getSumScore() - s.getSumScore());
        return result;

    }
}
