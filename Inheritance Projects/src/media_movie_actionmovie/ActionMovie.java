package media_movie_actionmovie;

public class ActionMovie extends Movie {
    int stuntCount;
    double fightIntensity;   

    public ActionMovie(String title, String genre, int duration, double rating,
                       int stuntCount, double fightIntensity) {

        super(title, genre, duration, rating);
        this.stuntCount = stuntCount;
        this.fightIntensity = fightIntensity;
    }

    public void displayActionMovie() {
        System.out.println("Action Movie Details:");
        System.out.println("Total Stunts: " + stuntCount);
        System.out.println("Fight Intensity: " + fightIntensity + "/10");
        System.out.println("----------------------------------");
    }
}
