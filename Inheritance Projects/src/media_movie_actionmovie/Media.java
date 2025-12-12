package media_movie_actionmovie;

public class Media {
	
	 String title;
	    String genre;

	    public Media(String title, String genre) {
	        this.title = title;
	        this.genre = genre;
	    }

	    public void displayMedia() {
	        System.out.println("Media Details:");
	        System.out.println("Title: " + title);
	        System.out.println("Genre: " + genre);
	        System.out.println("----------------------------------");
	    }
	}
