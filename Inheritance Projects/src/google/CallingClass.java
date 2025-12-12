package google;

public class CallingClass {
	public static void main(String[] args) {

        YouTube yt = new YouTube("YouTube", 2005, 5000, true);
        Gmail gm = new Gmail("Gmail", 2004, 15, true);
        GoogleMaps maps = new GoogleMaps("Google Maps", 2005, 220, true);

        yt.displayGoogleProduct();
        yt.displayYouTube();

        gm.displayGoogleProduct();
        gm.displayGmail();

        maps.displayGoogleProduct();
        maps.displayGoogleMaps();
    }
}
