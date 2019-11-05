package banyuan.day09.package01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 陈浩
 * @date Created on 2019/11/1
 * 1.分析以下需求，并用代码实现：
 * (1)统计每个单词出现的次数
 * (2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
 * (3)打印格式：
 * to=3
 * think=1
 * you=2
 */
public class P01 {
    public static void main(String[] args) {
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String key : arr) {
            //使用containsKey方法判断map集合中是否
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Set<String> keySet = map.keySet();

        //使用迭代器对元素进行输出
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}

