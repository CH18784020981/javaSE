package banyuan.day02.practice04;

/*
有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次 0 1 2 3 4 5 6 7 8 9

随机30个数字
 */
public class P09 {
    public static void main(String[] args) {
        int[] a = new int[30];
        int i = 0;
        int[] b = new int[10];
        for (i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9);
        }
        for (i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 0:b[0]++;break;
                case 1:b[1]++;break;
                case 2:b[2]++;break;
                case 3:b[3]++;break;
                case 4:b[4]++;break;
                case 5:b[5]++;break;
                case 6:b[6]++;break;
                case 7:b[7]++;break;
                case 8:b[8]++;break;
                case 9:b[9]++;break;
            }
        }
        System.out.println(" 0:" + b[0] + " 1:" + b[1] + " 2:" + b[2] + " 3:" + b[3] + " 4:"
                + b[4] + " 5:" + b[5] + " 6:" + b[6] + " 7:" + b[7] + " 8:" + b[8] + " 9:" + b[9]);


    }
}
