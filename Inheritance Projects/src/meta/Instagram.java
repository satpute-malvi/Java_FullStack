package meta;

public class Instagram extends MetaProducts {
    int dailyUsers;          
    String mainFeature;

    public Instagram(String productName, int releaseYear, int dailyUsers, String mainFeature) {
        super(productName, releaseYear);
        this.dailyUsers = dailyUsers;
        this.mainFeature = mainFeature;
    }

    public void displayInstagram() {
        System.out.println("Instagram Details:");
        System.out.println("Daily Users: " + dailyUsers + "M");
        System.out.println("Main Feature: " + mainFeature);
        System.out.println("----------------------------------");
    }
}
