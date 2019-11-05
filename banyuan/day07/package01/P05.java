package banyuan.day07.package01;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 5. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
 * 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
 * 应该输出为“我ABC”而不是“我ABC+汉的半个”。
 */
public class P05 {
    public static void main(String[] args) {
        String str = "我ABC汉DEF";
        String st =str.substring(0,5);
        System.out.println(str);   //我ABC
        System.out.println(str.getBytes());
    }


}
