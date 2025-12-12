package book_textbook_sciencebook;

public class ScienceBook extends TextBook {
    String branch;    
    int experiments;  

    public ScienceBook(String title, String author, double price, String subject, int standard,
                       String branch, int experiments) {

        super(title, author, price, subject, standard);
        this.branch = branch;
        this.experiments = experiments;
    }

    public void displayScienceBook() {
        System.out.println("Science Book Details:");
        System.out.println("Branch: " + branch);
        System.out.println("Number of Experiments: " + experiments);
        System.out.println("----------------------------------");
    }
}
