package method_overloading_pratice;

public class LogInDemo {
	
	    static void login(String username) {
	        System.out.println("Login using username: " + username);
	    }

	    static void login(String username, String password) {
	        System.out.println("Login using username and password");
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	    }

	    public static void main(String[] args) {
	        login("admin");
	        login("admin", "admin123");
	    }


}
