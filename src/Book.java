public class Book {

    private String title;
    private String author;
    private int pages;
    private int rating;
    private StringBuilder review;

    public Book(String title, String author, int pages, int rating, StringBuilder review) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.rating = rating;
        this.review = review;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author, int pages, int rating) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public StringBuilder getReview() {
        return review;
    }

    public void setReview(StringBuilder review) {
        this.review = review;
    }
}

