
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object comparison) {
        
        // if the variables share the same address, they are equal
        if (this == comparison) {
            return true;
        }

        // if the compared object is not of type Book, the objects are not equal
        if (!(comparison instanceof Book)) {
            return false;
        }

        // cast the Object type comparison object
        // into a Book type comparisonBook object
        Book comparisonBook = (Book) comparison;

        return this.name.equals(comparisonBook.name)
                && this.publicationYear == comparisonBook.getPublicationYear();
    }
}
