// Use of data binding, data hiding and encapsulation

package EmailApplication;

import java.util.Scanner;

public class Email {

	// Since we are using Encapsulation, we keep all the variables private so that no one can access
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String email;
	private String domainName = "company.com";

	// Constructor to get firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created:" + this.firstName + " " + this.lastName);

		// call a method asking for the department and return the department
		this.department = setDepartment();
		//System.out.println("Department:" + this.department);

		// call method that call random password
		//this.password = randomPassword(8);
		this.password = randomPassword(defaultPasswordLength);	
		System.out.println("Your Password is:" + this.password);
		
		//Combine Elements to generate Emails
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ domainName;
		//System.out.println("Your Email is:" + email);
	}

	// Ask for department
	private String setDepartment() {
		System.out.print("New Worker:" + firstName + "\nDepartment Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the department codes:");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if (departmentChoice == 1) {
			return "Sales";
		} else if (departmentChoice == 2) {
			return "Development";
		} else if (departmentChoice == 3) {
			return "Accounting";
		} else {
			return "";
		}
	}

	// generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHJIKLMNOPQRSTUVWXYZ123456789!@$#%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}

	// Set mailbox capacity
	//keeping this method public and hiding capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;		
	}
	
	// Set alternate Email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;	
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + 
				"\nCompany Name: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
}
