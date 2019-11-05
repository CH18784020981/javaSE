package banyuan.day06.p03;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * 定义一个MyStringUtil工具类，该类中定义三个方法，要求如下：
 * (1)public static char[] toCharArray(String str) :
 * 将给定的参数字符串转成对应的字符数组（不能直接调用jdk中的工具类及String类中的tocharArray方法）
 * (2) public static String getSingleString(String str) :
 * 去除给定的参数字符串中的重复字符（重复字符只保留一个），将新的字符串返回
 * (3)public static boolean isBalancedString(String str):
 * 如果左右两边字符相同则返回true，否则返回false， 例如：abccba是对称字符 例如：abcdecba不是对称字符
 */
public class MyStringUtil {
    public static void main(String[] args) {
        String a = "abcdefGGfedcba";

        char[] b = tCharArray(a);
            /*  for (char d:b) {
            System.out.println(d);
          }*/
        //getSingleString(a);
        System.out.println(getSingleString(a));
        System.out.println(isBalancedString(a));
    }

    public static char[] tCharArray(String str) {
        char[] result = new char[str.length()];
        str.getChars(0, str.length(), result, 0);


        return result;

    }

    public static String getSingleString(String str) {
        char[] arr = str.toCharArray();
        // 2. 定义新的容器, 用来存储唯一的字符
        StringBuffer sb = new StringBuffer();
        // 3. 遍历字符数组拿到每一个字符
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            // 4. 拿着每一个字符,判断容器中是否包含传入的字符串.
            if (!sb.toString().contains(c + "")) {
                // 5. 如果不包含就存储
                sb.append(c);
            }
        }

        return sb.toString();

    }

    public static boolean isBalancedString(String str) {
        StringBuffer sb = new StringBuffer(str);
        // 2. 将数据翻转
        sb.reverse();
        // 3. 如果翻转后的结果跟原字符串相同, 说明是对称字符串
        if (str.equals(sb.toString())) {
            return true;
        } else {
            return false;
        }
    }


}