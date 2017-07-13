package payilagam.java.basics.day1;

public class Customer {
	static String name ="sairaj";
	private static Object mobile;

	public static void main(String[] args) {
		Bank sbi=new Bank();
		sbi.CreateAccount(name);
	
		sbi.CreateAccount(name,mobile);
}
}
