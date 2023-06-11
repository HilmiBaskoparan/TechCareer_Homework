public class Book {
    private int pageCount;
    private String bookName, author;
    
    // Constructor
    public Book(String bookName, String author, int pageCount) {
        this.bookName = bookName;
        this.author = author;
        if (this.pageCount < 1 ) {
            this.pageCount = 10;
        }else {
            this.pageCount = pageCount;
        }
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    
    
}
