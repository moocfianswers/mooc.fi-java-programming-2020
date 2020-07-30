
public class Book {

    private String name;
    private int pages;
    private int publicationYear;

    public Book(String name, int pages, int publicationYear) {
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
