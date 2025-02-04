class Book {
    private static String libraryName = "Main Library";
    private final String isbn;
    private String title;
	private String author;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("LibraryName:" + libraryName );
    }
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title of book: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}
public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book("XYZ", "Aashi", "123-456-789");
        Book book2 = new Book("ABC", "Ayush", "789-456-123");
		Book.displayLibraryName();
        book1.displayDetails();
        book2.displayDetails();
    }
}