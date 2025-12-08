package constructor_pratice_questions;

/*
 Create a class Account with:
Default constructor → set balance = 1000
Parameterized constructor → set balance based on user input
Display both account balances.
 */

public class Account {
	public double balance;
	
	Account(){
		this.balance = 1000;
		this.displayBalance();
	}
	Account(double balance){
		this.balance = balance;
		this.displayBalance();
	}
	 public void displayBalance() {
		 System.out.println("Balance is: " + this.balance);
	 }
	 

}
