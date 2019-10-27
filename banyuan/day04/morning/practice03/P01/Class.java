package banyuan.day04.morning.practice03.P01;

public class Class {
    private String dname;
    private int dnum;
    Student[] students;
    // private Student class1;

    public Class() {
    }


    public Class(String dname, int dnum) {
        this.dname = dname;
        this.dnum = dnum;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDnum() {
        return dnum;
    }

    public void setDnum(int dnum) {
        this.dnum = dnum;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return dname;
    }

    public void setName(String name) {
        this.dname = name;
    }

    public int getNum() {
        return dnum;
    }

    public void setNum(int num) {
        this.dnum = num;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + dname + '\'' +
                ", num=" + dnum +
                '}';
    }
}
