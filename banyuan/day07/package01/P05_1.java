package banyuan.day07.package01;

import java.io.UnsupportedEncodingException;

/**
 * @author 陈浩
 * @date Created on 2019/10/30
 * <p>
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
 * 但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，输入"我ABC汉DEF"，6，
 * 应该输出为"我ABC"而不是"我ABC+汉的半个"。
 */


public class P05_1 {

    public static String subString(String str, int len) {
        if (str == null && "".equals(str)) {
            return null;
        }

        byte[] strBytes = null;
        try {
            strBytes = str.getBytes("GBK");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        int strLen = strBytes.length;
        if (len >= strLen || len < 1) {
            return str;
        }

        int count = 0;
        for (int i = 0; i < len; i++) {

            int value = strBytes[i];
//				System.out.print(value+",");
            //如果是汉字(负)，则统计截取字符串中的汉字所占字节数
            if (value < 0) {
                count++;
            }
//				System.out.println("zh count="+count);
        }
        //依据判断给定的字符串是否含有汉字，利用String类的substring()方法来截取不同的长度

        //根据所统计的字节数，判断截取到字符是否为半个汉字，奇数为半个汉字
        if (count % 2 != 0) {
            //如果在截取长度为1时，则将该汉字取出，
            //其他情况则不截取这里的截取长度则按字符长度截取（截取字节长度数-截取汉字字节数/2-截取到的半个汉字的字节数）
            len = (len == 1) ? len : len - count / 2 - 1;
//				System.out.println("处理后的len="+len);

        } else {
            //截取字符长度为字节长度-汉字所占字节长度/2（汉字占两个字节）
            len = len - (count / 2);
        }
        return str.substring(0, len);

    }

    public static void main(String[] args) {
        //情况一：
        String inStr = "我ABC你";
        String str = subString(inStr, 6);
        System.out.println(str);   //我ABC

        //情况二：首字符为汉字
        inStr = "我ABC汉DEF";
        str = subString(inStr, 1);
        System.out.println(str);   //我

        //情况三：中间有连续汉字
        inStr = "我AB爱孩子CDEF";
        str = subString(inStr, 9);
        System.out.println(str);   //我AB爱孩

        //情况四：没有汉字
        inStr = "ABCDEF";
        str = subString(inStr, 4);
        System.out.println(str);   //ABCD
    }
}
