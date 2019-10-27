package banyuan.day04.morning.practice01.P01;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setPagNum(209);
        book.setTitle("java核心技术");
        if (book.getPagNum() <= 200) {
            System.out.println("错误");
        } else
            System.out.println(book.detail());
    }
}
