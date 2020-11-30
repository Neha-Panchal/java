package EmailApplication;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email1 = new Email ("Neha" , "Panchal");
		
//		email1.setAlternateEmail("np@gmail.com");
//		System.out.println(email1.getAlternateEmail());
		
		System.out.println(email1.showInfo());
	}

}
