package Library;

public class Book {
    long id;
    String bookName;
    String autor;
    int price;
    BookGener gener;

    public Book(long id, String bookName, String autor, int price, BookGener gener) {
            this.id = id;
            this.bookName = bookName;
            this.autor = autor;
            this.price = price;
            this.gener = gener;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookGener getGener() {
        return gener;
    }

    public void setGener(BookGener gener) {
        this.gener = gener;
    }
}
