package google;

public class GoogleProduct {
	  String productName;
	    int releaseYear;

	    public GoogleProduct(String productName, int releaseYear) {
	        this.productName = productName;
	        this.releaseYear = releaseYear;
	    }

	    public void displayGoogleProduct() {
	        System.out.println("Google Product:");
	        System.out.println("Name: " + productName);
	        System.out.println("Release Year: " + releaseYear);
	        System.out.println("----------------------------------");
	    }
	}