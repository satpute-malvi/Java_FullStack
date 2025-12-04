package encapsulation_practice;

public class CallingLoginUser {

	public static void main(String[] args) {
		
		LoginUser lu = new LoginUser();
		
		lu.setUsername("malvi");
		lu.setPassword("Malvi@123");
		lu.setEmail("malvi@gmail.com");
		lu.setLastLogin("3 Des 2025");
		lu.setMobileNumber("4875648659");
		lu.setRole("Admin");
		lu.setVerified(true);
		
		System.out.println("<------Log in details--------->");
		System.out.println("Username          : " + lu.getUsername());
		System.out.println("Password          : " + lu.getPassword());
		System.out.println("Email             : " + lu.getEmail());
		System.out.println("Last Log In       : " + lu.getLastLogin());
		System.out.println("Mobile Numaber    : " + lu.getMobileNumber());
		System.out.println("Role              : " + lu.getRole());
		System.out.println("User varified     : " + lu.isVerified());
	}

}
