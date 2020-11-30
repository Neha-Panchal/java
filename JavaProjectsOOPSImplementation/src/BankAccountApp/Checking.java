package BankAccountApp;

public class Checking extends Account{
// List properties specific to a Checking account
	private int debitCardNo;
	private int debitCardPin;
	
// Constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		//call parent class using super keyword and execute Account class
		super(name,ssn,initDeposit);
		accountNumber = "2" + accountNumber;
		//System.out.println("Account Number" + this.accountNumber);
		//System.out.println("New Checking account");
		//System.out.println("Name is: "+name);
		
		setDebitCard();
	}
	@Override
	public void setRate() {
		//System.out.println("Implement rate for Checkings");
		rate = getBaseRate()*.15;
	}
	
// List any methods specific to checking account
public void setDebitCard() {
	debitCardNo = (int)(Math.random()*Math.pow(10,12));
	debitCardPin = (int)(Math.random()*Math.pow(10,4));
	//System.out.println("Card: " + this.debitCardNo);
	//System.out.println("Pin: "+ this.debitCardPin);
}
	public void showInfo() {
	super.showInfo();
	//System.out.println("Account Type: Checking");
	System.out.println("Your Checking Account features" + 
			"\n Debit Card Number: " + debitCardNo+
			"\n Debit Card Pin: " +debitCardPin
			);
}



}
