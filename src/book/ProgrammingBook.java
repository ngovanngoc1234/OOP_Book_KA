package book;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "" +
                "language = '" + language + '\'' +
                ", framework = '" + framework + '\'' +
                " ,bookCode = " + super.getBookCode() +
                ", Name = '" + super.getName() + '\'' +
                ", price = " + super.getPrice() +
                ", author = '" + super.getAuthor() + '\'';
    }
}
