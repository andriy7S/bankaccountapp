package bankaccountapp;

public abstract class Account implements IRate {
	
	// List common properties for savings and checking accounts
	String name;
	String SIN;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String SIN, double initDeposit) {
		this.name = name;
		this.SIN = SIN;
		balance = initDeposit;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
	}
	
	private String setAccountNumber() {
		String lastTwoOfSIN = SIN.substring(SIN.length()-2, SIN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSIN + uniqueID + randomNumber;
	}

	
	// List common methods
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber + 
				"\nBALANCE: " + balance
				);
	}

}
