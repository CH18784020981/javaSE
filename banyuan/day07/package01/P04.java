package banyuan.day07.package01;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
 * “To be or not to be"，将变成"oT eb ro ton ot eb."。
 */
public class P04 {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String[] a = str.split(" ");
        StringBuffer[] ss = new StringBuffer[a.length];
        for (int i = 0; i < a.length; i++) {
            StringBuffer s = new StringBuffer("");
            ss[i] =s.append(a[i]);
            System.out.print(ss[i].reverse() + " ");
        }
    }
}