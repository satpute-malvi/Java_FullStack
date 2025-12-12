package media_movie_actionmovie;

public class Movie extends Media {
    int duration;       
    double rating;      

    public Movie(String title, String genre, int duration, double rating) {
        super(title, genre);
        this.duration = duration;
        this.rating = rating;
    }

    public void displayMovie() {
        System.out.println("Movie Details:");
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating + "/10");
        System.out.println("----------------------------------");
    }
}
