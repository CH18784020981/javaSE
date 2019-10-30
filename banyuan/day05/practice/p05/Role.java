package banyuan.day05.practice.p05;

/**
 * @author newpc
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    public Role() {
        System.out.println("Pole的无参构造");
    }

    public Role(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("Pole的有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract void play();
}
