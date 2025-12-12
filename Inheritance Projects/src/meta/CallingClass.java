package meta;

public class CallingClass {
	
	public static void main(String[] args) {

        Instagram ig = new Instagram("Instagram", 2010, 2000, "Reels");
        Facebook fb = new Facebook("Facebook", 2004, 1000000, true);
        WhatsApp wa = new WhatsApp("WhatsApp", 2009, 500000, true);

        ig.displayMetaProduct();
        ig.displayInstagram();

        fb.displayMetaProduct();
        fb.displayFacebook();

        wa.displayMetaProduct();
        wa.displayWhatsApp();
    }

}
