package payilagam.java.basics.day1;

public class Customer {
	 static String name ="sairaj";
     static int mobile=1234;

	public static void main(String[] args) {
		Customer customerobj=new Customer();
	    Bank sbi=new Bank(customerobj);

		sbi.createAccount(name, mobile);
		sbi.createAccount(name,mobile);
    	sbi.CreateAccount(customerobj);
	
}
}