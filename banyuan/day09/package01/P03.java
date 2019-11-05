package banyuan.day09.package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 陈浩
 * @date Created on 2019/11/1
 * 3.已知某学校的教学课程内容安排如下：
 * 完成下列要求：
 * 1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
 * 课程安排。
 * 2） 增加了一位新老师Allen 教JDBC
 * 3） Lucy 改为教CoreJava
 * 4） 遍历Map，输出所有的老师及老师教授的课程(Set<Map.Entry<String,String>>、Set<String> get(key))
 * 5） 利用Map，输出所有教JSP 的老师。
 */
public class P03 {
    public static void main(String[] args) {
        //使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
        //课程安排
        Map map = new HashMap();
        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");
        //增加了一位新老师Allen 教JDBC
        map.put("Allen", "JDBC");
        //Lucy 改为教CoreJava
        map.replace("Lucy", "JSP", "CoreJava");
        //遍历Map，输出所有的老师及老师教授的课程
        // (Set<Map.Entry<String,String>>、Set<String> get(key))
        Set<Map.Entry> set = map.keySet();
        for (Object m : set) {
            System.out.println(m + "=" + map.get(m));
        }
        //利用Map，输出所有教JSP 的老师。
        //注意：上面lucy教jSP已经被修改成教CoreJava
        for (Object m : set) {
            if ("JSP".equals(map.get(m))) {
                System.out.println(m);
            }
        }
    }
}
