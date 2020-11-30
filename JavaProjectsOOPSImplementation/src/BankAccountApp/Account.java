package BankAccountApp;


//Dont need to create object from Account class hence abstract
//Whatever is present in IRate needs to be included in Acoount- Savings and Checking
public abstract class Account implements IRate {

	//List common properties for savings and checking accounts
	private String name;
	private String ssn;
	protected String accountNumber;
	private double balance;
	protected double rate;
	private static int index = 10000;
	
	//Constructor to set base properties and intialize the account
	public Account(String name,String ssn, double initDeposit) {
//		System.out.println("New Account :");
//		System.out.println("Name is: "+name);
		this.name=name;
		this.ssn=ssn;
		balance=initDeposit;
		//System.out.println("Name: "+ name +"\nSSN: "+ ssn + "\nBalance: $" + balance);
		//set Account Number
		index++;
		this.accountNumber=setAccountNumber();
		//System.out.println("Account Number" + this.accountNumber);
		//System.out.println(getBaseRate());
		setRate();
	}
	
	
	public abstract void setRate();
	
	//set Account Number
		private String setAccountNumber() {
			String lastTwoOfSsn =ssn.substring(ssn.length()-2, ssn.length());
			int uniqueID = index;
			int randomNumber = (int)(Math.random()*Math.pow(10, 3));
			return lastTwoOfSsn + uniqueID + randomNumber;		
		}
		
	public void compound() {
		double accruedInterest = balance + (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
	}
	
	
	//List Common methods - transactions
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + "to" + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your Balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println("Name: " + name +
							"\nAccount Number: " + accountNumber+
							"\nBalance: $"+balance+
							"\nRate: " + rate + "%");
	}
	
	
	
}
