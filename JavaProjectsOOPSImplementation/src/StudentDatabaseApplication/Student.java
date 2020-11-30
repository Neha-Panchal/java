package StudentDatabaseApplication;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int graduationYear;
	private String studentId;
	private String courses = null;
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor: user to prompt Student's name and year 
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter students First Name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter students Last Name: ");
		this.lastName=in.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter students Graduation Year: ");
		this.graduationYear=in.nextInt();
		
		setStudentID();
		//System.out.println(firstName + " " + lastName + " " + graduationYear + " " + studentId);		
	}
	
	//Generate an ID
	private void setStudentID() {
		
		//Grade level + ID
		id++;
		//return graduationYear + "" + id;
		this.studentId = graduationYear+ "" +id;
	}
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n" + course;
			tutionBalance = tutionBalance + costOfCourse;
		}else {break;}
		
		}while (1!=0);
		//System.out.println("Enrolled in: " + courses);
		//System.out.println("Tution Balance: " + tutionBalance);
	}
	
	//view balance 
	public void viewBalance() {
		System.out.println("Your balance is: $" + tutionBalance);
	}
	//pay tution
	//public void payTution(int payment) {
	    public void payTution() {
	    	
	    viewBalance();
	    
	    System.out.print("Enter your payment: $");
	    Scanner in = new Scanner(System.in);
	    int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	//Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName 
				+ "\nGraduation Year: "+ graduationYear
				+ "\nStudent Id: "+ studentId
				+"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tutionBalance;
	}
	
	
}
