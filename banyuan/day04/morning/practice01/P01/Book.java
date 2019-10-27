package banyuan.day04.morning.practice01.P01;

public class Book {
    private String title;
    private int pagNum = 200;

    public Book() {
    }

    public Book(String title, int pagNum) {
        this.title = title;
        this.pagNum = pagNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagNum() {
        return pagNum;
    }

    public void setPagNum(int pagNum) {
        this.pagNum = pagNum;
    }

    public String detail() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagNum=" + pagNum +
                '}';
    }
}
