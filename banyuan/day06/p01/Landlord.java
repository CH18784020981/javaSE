package banyuan.day06.p01;

/**
 * @author 陈浩
 *
 * 问题暂未解决
 */
public class Landlord {
    public static void main(String[] args) {

        int i;
        int[] Player_A = new int[18];
        int[] Player_B = new int[18];
        int[] Player_C = new int[18];
        int[] Ground = new int[4];
        for (i = 1; i <= 3; i++) {
            Ground[i] = getOneCard();
        }
        sortCards(Ground, 4);
        for (i = 1; i <= 17; i++) {
            Player_A[i] = getOneCard();
            Player_B[i] = getOneCard();
            Player_C[i] = getOneCard();
        }
        System.out.println("玩家牌");
        sortCards(Player_A, 18);
        sortCards(Player_B, 18);
        sortCards(Player_C, 18);
        System.out.println("\n玩家 A:");
        showCards(Player_A, 17);
        System.out.println("\n玩家 B:");
        showCards(Player_B, 17);
        System.out.println("\n玩家 C:");
        showCards(Player_C, 17);
        System.out.println("\n地主牌:");
        showCards(Ground, 3);

    }

    public static int getOneCard() {
        int in = (int) (Math.random() * 53);
        int[] cards = new int[54];
            while (cards[in] == 1) {
                in = (int) (Math.random() * 53);
            }
            //cards[in] = 1;
            return in;
        }



    public static void changeCard(int card) {

        card /= 4.00;
        switch (card) {
            case 0:
                System.out.print("3 ");
                break;
            case 1:
                System.out.print("4 ");
                break;
            case 2:
                System.out.print("5 ");
                break;
            case 3:
                System.out.print("6 ");
                break;
            case 4:
                System.out.print("7 ");
                break;
            case 5:
                System.out.print("8 ");
                break;
            case 6:
                System.out.print("9 ");
                break;
            case 7:
                System.out.print("10 ");
                break;
            case 8:
                System.out.print("J ");
                break;
            case 9:
                System.out.print("Q ");
                break;
            case 10:
                System.out.print("K ");
                break;
            case 11:
                System.out.print("A ");
                break;
            case 12:
                System.out.print("2 ");
                break;
        }
    }

    public static void showCards(int[] player, int count)//打印玩家的牌
    {
        int i;
        for (i = 1; i <= count; i++) {
            if (player[i] == 52) {
                System.out.print(" 小王");

            } else if (player[i] == 51) {
                System.out.print(" 大王" );
            } else if (player[i] % 4 == 0) {
                System.out.print(" 黑桃");
                changeCard(player[i]);
            } else if ((player[i] + 1) % 4 == 0) {
                System.out.print(" 方块");
                changeCard(player[i]);
            } else if (player[i] % 2 == 0) {
                System.out.print(" 红桃");
                changeCard(player[i]);
            } else {
                System.out.print(" 梅花");
                changeCard(player[i]);
            }
        }
    }

    public static void sortCards(int[] Nums, int Length) {
        int i, j, iTemp;
        for (i = 1; i <= Length - 1; i++) {
            for (j = 1; j <= Length - 2; j++) {
                if (Nums[j] > Nums[j + 1]) {
                    iTemp = Nums[j];
                    Nums[j] = Nums[j + 1];
                    Nums[j + 1] = iTemp;
                }
            }
        }
    }
}



