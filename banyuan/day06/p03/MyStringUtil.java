package banyuan.day06.p03;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 定义一个MyStringUtil工具类，该类中定义三个方法，要求如下：
 * (1)public static char[] toCharArray(String str) :
 * 将给定的参数字符串转成对应的字符数组（不能直接调用jdk中的工具类及String类中的tocharArray方法）
 * (2) public static String getSingleString(String str) :
 * 去除给定的参数字符串中的重复字符（重复字符只保留一个），将新的字符串返回
 * <p>
 * (3)public static boolean isBalancedString(String str):
 * 如果左右两边字符相同则返回true，否则返回false， 例如：abccba是对称字符 例如：abcdecba不是对称字符
 */
public class MyStringUtil {
    public static void main(String[] args) {
        String a="abcd";
        char []b=a.toCharArray();
    }

    public static char[] tCharArray(String str) {
        char result[] = new char[str.length()];
        System.arraycopy(str, 0, result, 0, str.length());
        return result;

    }

//    public static String getSingleString(String str) {
//
//    }

//    public static boolean isBalancedString(String str) {
//        boolean flag = false;
//        if ()
//
//            return flag;
//    }

}