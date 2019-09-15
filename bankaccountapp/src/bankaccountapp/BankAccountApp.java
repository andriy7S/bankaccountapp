package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chacc1 = new Checking("Tom Willson", "123456789", 1500);
		
		Savings savacc1 = new Savings("Tim Horton", "321456987", 2500);
		
		savacc1.showInfo();
		System.out.println("*********************");
		chacc1.showInfo();
		
        // Read a CSV File then create new account based on that data
	}

}
