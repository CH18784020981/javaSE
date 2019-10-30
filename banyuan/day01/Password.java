package banyuan.day01;

import java.util.Scanner;

/**
3. 有1个人有名字和账户密码（随便自己设置）
	现在要登录一个系统, 需要去判断这个名字和密码是否一致
	如果名字不一致 那么给出提示：名字不一样请重新输入，
	如果名字一样那么就继续进行下一步  密码的判断,如果密码不一样
	给出提示：您输入的密码不一致,请重新输入。
	如果三次密码都不一样的话那么整个程序就退出不再执行
 * @author 陈浩
 */
public class Password {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "陈浩";
        String password = "123456";
        int i = 0;
        int j = 0;
        do {
            System.out.println("请输入名字:");
            String inputName = in.next();

            if (inputName.equals(name)) {
                do {
                    System.out.println("请输入密码:");
                    String inputPassword = in.next();
                    if (password.equals(inputPassword)) {
                        System.out.println("欢迎进入！！！");
                        break;
                    } else {
                        System.out.println("密码错误！！！");
                    }
                    i++;
                } while (i != 3);
                break;
            } else {
                System.out.println("名字不一样，请重新输入！！！");
            }
        } while (j == 0);
    }
}

