package BankAccountApp;

public interface IRate {
	
	//Write method that returns the base Rate
	default double getBaseRate() {
		return 2.5;
	}
}
