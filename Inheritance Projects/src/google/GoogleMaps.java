package google;

public class GoogleMaps extends GoogleProduct {
    int countriesCovered;
    boolean offlineMode;

    public GoogleMaps(String productName, int releaseYear, int countriesCovered, boolean offlineMode) {
        super(productName, releaseYear);
        this.countriesCovered = countriesCovered;
        this.offlineMode = offlineMode;
    }

    public void displayGoogleMaps() {
        System.out.println("Google Maps Details:");
        System.out.println("Countries Covered: " + countriesCovered);
        System.out.println("Offline Mode Available: " + offlineMode);
        System.out.println("----------------------------------");
    }
}
