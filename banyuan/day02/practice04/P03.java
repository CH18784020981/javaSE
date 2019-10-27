package banyuan.day02.practice04;

/*
打印出下面的图案
54321
5432
543
54
5
 */
public class P03 {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(j);

            }
            System.out.println();
        }

    }
}
