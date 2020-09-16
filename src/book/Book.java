package book;

public class Book {
    private int bookCode;
    private String Name;
    private int price;
    private  String author;

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        Name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "" +
                "bookCode =" + bookCode +
                ", Name ='" + Name + '\'' +
                ", price =" + price +
                ", author ='" + author + '\'';
    }
}
