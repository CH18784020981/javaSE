package banyuan.day01;

/**
 * @author 陈浩
 * <p>
 * <p>
 * 在控制台上输出以下的图形
 * 1
 * 23
 * 456
 * 7890
 */

public class Graph {

    public static void main(String[] args) {
        int temp = 1;
        int a = 4;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(temp % 10);
                temp++;
            }
            System.out.println();
        }
    }

}
