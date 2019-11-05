package banyuan.day07.package01;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 2.定义一个StringBuffer类对象，
 * 1）使用append方法向对象中添加26个字母，并倒序遍历输入
 * 2）删除前五个字符
 */
public class P02 {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer();
        char[] chars = new char[26];
        char z = 'z';
        for (int i = 0; i < chars.length; i++) {
            chars[i] = z;
            z--;
        }
        StringBuffer a=st.append(chars);
        System.out.println(a);
        StringBuffer b=a.delete(0,4);
        System.out.println(b);

    }
}
