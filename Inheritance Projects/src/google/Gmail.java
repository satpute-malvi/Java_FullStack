package google;

public class Gmail extends GoogleProduct {
    int storageLimit;         // in GB
    boolean spamFilter;

    public Gmail(String productName, int releaseYear, int storageLimit, boolean spamFilter) {
        super(productName, releaseYear);
        this.storageLimit = storageLimit;
        this.spamFilter = spamFilter;
    }

    public void displayGmail() {
        System.out.println("Gmail Details:");
        System.out.println("Storage Limit: " + storageLimit + "GB");
        System.out.println("Spam Filter Enabled: " + spamFilter);
        System.out.println("----------------------------------");
    }
}