package LazarsBookShop;

public class Book {

    private String title;
    private String autor;
    private String year;
    private String price;

    public Book(){}

    public Book(String title, String autor, String year, String price) {
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    public void bookInfo(Book books[],int i){
        System.out.println("Title: " + books[i].getTitle() + " Autor: " + books[i].getAutor() +
                " Release Date: " + books[i].getYear() + " Price: " + books[i].getPrice() + "BGN");
    }


}
