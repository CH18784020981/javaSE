package banyuan.day09.package01;


/**
 * @author 陈浩
 * @date Created on 2019/10/31
 */
public class Person {
    private String num;
    private int age;
    private String name;
    private String address;
    private String sex;

    public Person() {
    }

    public Person(String num, int age, String name, String address, String sex) {
        this.num = num;
        this.age = age;
        this.name = name;
        this.address = address;
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "num='" + num + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

