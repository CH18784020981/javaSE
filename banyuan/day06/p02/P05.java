package banyuan.day06.p02;

/**
 * String  st1="aa,bb,cc";  //根据逗号来截取
 * String  st3="aa   bb    cc";//  根据空格来截取
 * String st4="D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";  //根据 \\ 截取
 * 得到截取之后的数据。
 */
public class P05 {
    public static void main(String[] args) {
        String st1 = "aa,bb,cc";
        String st3 = "aa   bb    cc";
        String st4 = "D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";
        System.out.println(st1.substring(0, st1.indexOf(',')));
        System.out.println(st3.substring(0, st3.indexOf(' ')));
        System.out.println(st4.substring(0, st4.indexOf("\\")));
    }
}
