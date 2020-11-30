package StudentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ask number of users to be added
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int noOfStudents = in.nextInt();
		Student[] students = new Student[noOfStudents];
		
		
		//Create n-number of students
		for (int i=0; i<noOfStudents; i++) {
			//Student student = new Student();
			students[i]=new Student();
			students[i].enroll();
			//student1.payTution(500);
			students[i].payTution();
			
		}
		for (int i=0; i<noOfStudents; i++) {
			System.out.println(students[i].toString());	
			
		}
		

	}

}
