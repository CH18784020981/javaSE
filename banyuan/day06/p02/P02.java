package banyuan.day06.p02;

/**
 * 2.以下一段话：这些年一个人，风也过，雨也过,有过泪,有过错，还记得坚持什么，
 * 真爱过才会懂，会寂寞会回首，终有梦终有你在心中。统计 过 出线的次数
 *
 * @author 陈浩
 */
public class P02 {
    public static void main(String[] args) {
        String str = "2.以下一段话：这些年一个人，风也过，雨也过,有过泪,有过错，" +
                "还记得坚持什么，真爱过才会懂，会寂寞会回首，" +
                "终有梦终有你在心中。";
        char arr[] = str.toCharArray();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '过') {

                temp++;
            }

        }
        System.out.println("过出现的次数：" + temp);
    }
}
