package banyuan.day01;

/**
int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
	要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
		int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
	思路：生活中的问题解决 = 程序中的解决；
	1、	确定出不为0的个数，这样可以开辟新数组；
	2、	从旧的数组之中，取出内容，并将其赋给新开辟的数组；
	4.把整型  字符型  和  字符串型的数组 里面的元素 给我倒序
	5. 数组获取最值(获取数组中的最大值最小值)

 */
public class Array {
    public static void main(String[] args) {
        int[] oddArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int j = 0;
        for (int i = 0; i < oddArr.length; i++) {
            if (oddArr[i] != 0) {
                j++;
            }
        }
        int[] newArr = new int[j];
        j = 0;
        for (int i = 0; i < oddArr.length; i++) {
            if (oddArr[i] != 0) {
                newArr[j] = oddArr[i];
                j++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
        System.out.println();
        int[] Int = {1, 2, 4, 5, 7, 6};
        char[] Char = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < Int.length; i++) {
            System.out.print(Int[Int.length - i - 1]);
        }
        System.out.println();
        for (int i = 0; i < Char.length; i++) {
            System.out.print(Char[Char.length - i - 1]);
        }
        System.out.println();
        int sum = newArr[0];
        for (int i = 0; i < newArr.length; i++) {
            if (sum < newArr[i]) {
                sum = newArr[i];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < newArr.length; i++) {
            if (sum > newArr[i]) {
                sum = newArr[i];
            }
        }
        System.out.println(sum);
    }
}
