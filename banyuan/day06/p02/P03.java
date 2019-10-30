package banyuan.day06.p02;

/**
 * 3.编写敏感词过滤器。比如:恐怖   爆炸  性   枪  军火 色情 等
 * 如果出现这些字眼 就用**代替,输入一句话其中包含敏感字符
 * 最终输出屏蔽之后的数据
 */
public class P03 {
    public static void main(String[] args) {
        String str = "有人在倒卖军火，比如枪，局部地区发生爆炸，艾滋病通过性传播，所以少看点色情图片，这些都是很恐怖的事情,恐";
//        char[] arr = str.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == '枪' || arr[i] == '性') {
//                arr[i] = '*';
//            }
//            boolean a = (arr[i] == '恐' && arr[i + 1] == '怖') ||
//                    (arr[i] == '军' && arr[i + 1] == '火') ||
//                    (arr[i] == '色' && arr[i + 1] == '情') || (arr[i] == '爆' && arr[i + 1] == '炸');
//            if (a) {
//                arr[i] = '*';
//                arr[i + 1] = '*';
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//

        System.out.println(str.replace("色情", "**")
                .replace("军火", "**")
                .replace("恐怖", "**")
                .replace("爆炸", "**")
                .replace("枪", "*")
                .replace("性", "*"));

    }
}
