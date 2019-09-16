package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		// Read a CSV File then create new account based on that data
		String file = "C:\\Users\\cnc\\Nextcloud\\Java_2019\\Git\\bankaccountapp\\NewBankAccounts.csv";
		/*
		 * Checking chacc1 = new Checking("Tom Willson", "123456789", 1500); Savings
		 * savacc1 = new Savings("Tim Horton", "321456987", 2500); savacc1.showInfo();
		 * System.out.println("*********************"); chacc1.showInfo();
		 * savacc1.compound();
		 */

		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {

			String name = accountHolder[0];
			String SIN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, SIN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, SIN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
	
		for (Account acc : accounts) {
			System.out.println("\n****************************");
			acc.showInfo();
		}
	}

}
