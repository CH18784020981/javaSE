package banyuan.day06.p02;


/**
 * 创建Student类，属性：学号 姓名 年龄
 * 1将这些Student对象放进数组中
 * 查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
 * 3.计算所有学生的平均年龄，最大年龄，最小年龄
 * 4.如果存在名字叫张三的将名字改为张兵
 *
 * @author newpc
 */
public class Student {
    private String name;
    private int num;
    private int age;

    public Student() {
    }

    public Student(int num, String name, int age) {
        this.name = name;
        this.num = num;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", age=" + age +
                '}';
    }

//
        public String search(String input) {

            if (input.equals(new Student().getName())) {
                return this.toString();
            }
            return "没有此人";
    }
}