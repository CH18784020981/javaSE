package banyuan.day09.package03.P02;

/**
 * @author 陈浩
 * @date Created on 2019/11/3
 * .编写一个类Book，具有name,price,press,author 然后创建5个对象
 * 放入ArrayList中，并实现按照price大小排序，
 * 然后遍历ArrayList输出每个Book对象, 使用toString 方法打印。
 */
public class Book {
    private String name;
    private int price;
    private String press;
    private String author;

    public Book() {
    }

    public Book(String name, int price, String press, String author) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
