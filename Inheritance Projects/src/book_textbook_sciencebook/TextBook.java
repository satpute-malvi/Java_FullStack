package book_textbook_sciencebook;

public class TextBook extends Book {
    String subject;
    int standard;

    public TextBook(String title, String author, double price, String subject, int standard) {
        super(title, author, price);
        this.subject = subject;
        this.standard = standard;
    }

    public void displayTextBook() {
        System.out.println("TextBook Details:");
        System.out.println("Subject: " + subject);
        System.out.println("Standard/Class: " + standard);
        System.out.println("----------------------------------");
    }
}
