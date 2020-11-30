package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
	
	List<Account> accounts = new LinkedList<Account>();
	/*
	// Will call Checking and Saving constructors
	Checking chkacc1 = new Checking("Neha Panchal","123456789",1234);
	Savings saveacc1 = new Savings("John Williams","123344556", 2500);
	 
	saveacc1.compound();
	
	chkacc1.showInfo();
	System.out.println("***********************");
	saveacc1.showInfo();
	*/
//	saveacc1.deposit(5000);
//	saveacc1.withdraw(200);
//	saveacc1.transfer("Brokerage", 300);

	//Read a .csv file
	String file = "C:\\Users\\nehar\\Desktop\\JavaProjectOOPS\\original.csv";
		
	List<String[]> newAccountHolders = Utilities.CSV.read(file);
	for(String[] accountHolder : newAccountHolders) {
		//System.out.println("New Account");
		String name = accountHolder[0];
		String ssn = accountHolder[1];
		String accountType = accountHolder[2];
		double initDeposit = Double.parseDouble(accountHolder[3]);
		//System.out.println(name + " " + ssn + " " + accountType + " $ " + initDeposit);
		
		if (accountType.equals("Savings")) {
			//System.out.println("Open a Saving Account");
			accounts.add(new Savings(name, ssn, initDeposit));
		}else if(accountType.equals("Checking")){
			//System.out.println("Open a Checking Account");
			accounts.add(new Checking(name, ssn, initDeposit));
		}else {
			System.out.println("Error Reading Account Type");
		}
		
	}
	

	//accounts.get(3).showInfo();
	//create new account based on the read data
	for(Account acc: accounts) {
		System.out.println("*******************");
		acc.showInfo();
	}
	//accounts.get((int)Math.random() * accounts.size()).deposit(10000);
	//accounts.get((int)Math.random() * accounts.size()).deposit(1500);
	}
}
