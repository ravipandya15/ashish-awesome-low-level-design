package librarymanagementsystem;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final int publicationYear;
    private boolean available;
    // can we have no. of copies as a field?
    // need to create rwo variables.
    //    1. totalCopies
    //    2. availableCopies. OR
//            3. assiedCopies
    // when give book to a user, increment count of assignedCopies OR [decrement available copies]

    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
