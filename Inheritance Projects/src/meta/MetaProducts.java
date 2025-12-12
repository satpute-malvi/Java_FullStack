package meta;

public class MetaProducts {
	
	String productName;
    int releaseYear;

    public MetaProducts(String productName, int releaseYear) {
        this.productName = productName;
        this.releaseYear = releaseYear;
    }

    public void displayMetaProduct() {
        System.out.println("Meta Product:");
        System.out.println("Name: " + productName);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("----------------------------------");
    }

}
