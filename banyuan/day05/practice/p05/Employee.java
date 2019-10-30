package banyuan.day05.practice.p05;

/**
 * @author newpc
 */
public class Employee extends Role {
    static int id;
    private int salary;

    public Employee(int salary) {
        super();
        this.salary = salary;
        System.out.println("上面是谁");
    }

    public Employee() {
        System.out.println("Emloyee无参构造");
    }

    @Override
    public void play() {
        System.out.println("玩");
    }

    final public void sing() {
        System.out.println("唱歌🎤");
    }
}
