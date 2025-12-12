package google;

public class YouTube extends GoogleProduct {
    int dailyViews;            // in millions
    boolean monetization;

    public YouTube(String productName, int releaseYear, int dailyViews, boolean monetization) {
        super(productName, releaseYear);
        this.dailyViews = dailyViews;
        this.monetization = monetization;
    }

    public void displayYouTube() {
        System.out.println("YouTube Details:");
        System.out.println("Daily Views: " + dailyViews + "M");
        System.out.println("Monetization Enabled: " + monetization);
        System.out.println("----------------------------------");
    }
}
