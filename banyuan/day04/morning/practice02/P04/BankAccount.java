package banyuan.day04.morning.practice02.P04;
/*
设计一个银行账户类，
其中包括：账户信息：账号、姓名、开户时间、身份证号码、账户上的金额等成员。
有：存款方法、取款方法、显示开户时间的方法、获得账上的金额的方法等。
并编写测试类
 */

public class BankAccount {
    private int account;
    private String name;
    private String time;
    private String idNumber;
    private String money;

    public BankAccount() {
    }

    public BankAccount(int account, String name, String time, String idNumber, String money) {
        this.account = account;
        this.name = name;
        this.time = time;
        this.idNumber = idNumber;
        this.money = money;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account=" + account +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
