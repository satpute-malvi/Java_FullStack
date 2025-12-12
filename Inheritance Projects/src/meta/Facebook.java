package meta;

public class Facebook extends MetaProducts {
    int activeGroups;
    boolean marketplaceAvailable;

    public Facebook(String productName, int releaseYear, int activeGroups, boolean marketplaceAvailable) {
        super(productName, releaseYear);
        this.activeGroups = activeGroups;
        this.marketplaceAvailable = marketplaceAvailable;
    }

    public void displayFacebook() {
        System.out.println("Facebook Details:");
        System.out.println("Active Groups: " + activeGroups);
        System.out.println("Marketplace Available: " + marketplaceAvailable);
        System.out.println("----------------------------------");
    }
}