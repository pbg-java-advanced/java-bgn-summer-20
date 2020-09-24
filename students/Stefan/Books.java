public class Books {
    private String bookName;
    private String author;
    private int bookReleaseDate;
    private double price;

    public Books(String bookName, String author, int bookReleaseDate, double price) {
        this.bookName = bookName;
        this.author = author;
        this.bookReleaseDate = bookReleaseDate;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    private void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private int getBookReleaseDate() {
        return bookReleaseDate;
    }

    private void setBookReleaseDate(int bookReleaseDate) {
        this.bookReleaseDate = bookReleaseDate;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
}
