package BankAccountApp;

public class Savings extends Account {
	
	// List properties specific to a Saving account
	private int safetyDepositBoxId;
	private int safetyDepositKey;
	
	// Constructor to initialize Saving account properties
	public Savings(String name, String ssn, double initDeposit) {
		//call parent class using super keyword and execute Account class
		super(name,ssn,initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		//System.out.println("Account Number" + this.accountNumber);
		//System.out.println("New Savings account");
		//System.out.println("Name is: "+name);
	}
	
	@Override
	public void setRate() {
		//System.out.println("Implement rate for Savings");
		rate = getBaseRate() - .25;
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxId =(int)(Math.random()*Math.pow(10,3));
		safetyDepositKey =(int)(Math.random()*Math.pow(10,4));
		//System.out.println(safetyDepositBoxId);
		
	}
	// List any methods specific to Saving account
	public void showInfo() {
		System.out.println("Account Type: Saving");
		super.showInfo();
		System.out.println("Your Saving Account features" + 
							"\n Safety Deposit Box Id: " + safetyDepositBoxId+
							"\n Safety Deposit Box Key: " +safetyDepositKey
							);
		
	}
}
