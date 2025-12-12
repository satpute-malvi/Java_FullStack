package meta;

public class WhatsApp extends MetaProducts {
	    int messageLimit;      // messages per second
	    boolean endToEndEncryption;

	    public WhatsApp(String productName, int releaseYear, int messageLimit, boolean endToEndEncryption) {
	        super(productName, releaseYear);
	        this.messageLimit = messageLimit;
	        this.endToEndEncryption = endToEndEncryption;
	    }

	    public void displayWhatsApp() {
	        System.out.println("WhatsApp Details:");
	        System.out.println("Message Limit: " + messageLimit + " msg/sec");
	        System.out.println("End-to-End Encryption: " + endToEndEncryption);
	        System.out.println("----------------------------------");
	    }
}

