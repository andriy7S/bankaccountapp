package bankaccountapp;

public class Checking extends Account {
	
	// List properties specific to Checking account
	int debitCardNumber;
	int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String SIN, double initDeposit) {
		super(name, SIN, initDeposit);
		accountNumber = "2" + accountNumber;
	}
	
	// List any methods specific to the Checking account
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
	}

}
