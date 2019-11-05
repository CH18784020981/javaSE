package banyuan.day06.p01;

/**
 * 一个斗地主的小程序
 */
public class P {
    public static void main(String[] args) {

        String[] str = {"♥A", "♥2", "♥3", "♥4", "♥5", "♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q",
                "♥K", "♠A", "♠2", "♠3", "♠4", "♠5", "♠6", "♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K",
                "♦A", "♦2", "♦3", "♦4", "♦5", "♦6", "♦7", "♦8", "♦9", "♦10", "♦J", "♦Q", "♦K",
                "♣A", "♣2", "♣3", "♣4", "♣5", "♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "大王", "小王"};

        int a = 53;
        int in;
        System.out.println("第一个人的牌：");
        for (int j = 0; j < 17; j++) {
            in = (int) (Math.random() * a);
            System.out.print(str[in]);
            str[in] = str[a];
            a--;
        }
        System.out.println("\n第二个人的牌：");
        for (int j = 0; j < 17; j++) {
            in = (int) (Math.random() * a);
            System.out.print(str[in]);
            str[in] = str[a];
            a--;
        }
        System.out.println("\n第三个人的牌：");
        in = (int) (Math.random() * a);
        for (int j = 0; j < 17; j++) {
            in = (int) (Math.random() * a);
            System.out.print(str[in]);
            str[in] = str[a];
            a--;
        }
        System.out.println("\n地主牌：");
        in = (int) (Math.random() * a);
        for (int j = 0; j < 3; j++) {
            in = (int) (Math.random() * a);
            System.out.print(str[in]);
            str[in] = str[a];
            a--;
        }

    }

}
