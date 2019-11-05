package banyuan.day09.package01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 陈浩
 * @date Created on 2019/11/1
 * 2.使用包装类作为键给map集合添加数据和使用对象作为键添加数据
 */
public class P02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(new Integer(20), "hhh");
        map.put(new Double(20.3), "hhh");
        map.put(new Float(2.5F), "hhh");
        map.put(new Character('a'), "hhh");
        map.put(new Boolean(true), "hhh");
        map.put(new Byte((byte) 12), "hhh");
        map.put(new Long(2000000000), "hhh");
        map.put(new Short((short) 1000), "hhh");
        map.put(new Person("", 1, "", "", ""), "lll");
        System.out.println(map);

    }
}
