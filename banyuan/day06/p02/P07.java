package banyuan.day06.p02;

/**
 * 2 .如下字符串：
 * 01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21
 * 分割出每个人的信息，样式如下：
 * 01 张三 20
 * 02 李四 18
 * …..
 * 创建Student类，属性：学号 姓名 年龄
 * 1将这些Student对象放进数组中
 * 2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
 * 3.计算所有学生的平均年龄，最大年龄，最小年龄
 * 4.如果存在名字叫张三的将名字改为张兵
 * @author newpc
 */
public class P07 {
    public static void main(String[] args) {
        String str = "01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
        String[] a = str.split("\\*");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].replace("#"," "));
        }
    }
}
