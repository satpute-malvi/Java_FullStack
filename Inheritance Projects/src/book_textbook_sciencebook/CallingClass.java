package book_textbook_sciencebook;

public class CallingClass {
	public static void main(String[] args) {

        ScienceBook sb = new ScienceBook("Fundamentals of Physics", "H.C. Verma", 499.00,
                "Science", 11, "Physics", 25);

        sb.displayBook(); 
        sb.displayTextBook(); 
        sb.displayScienceBook(); 
    }
}
