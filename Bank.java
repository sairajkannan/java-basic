package payilagam.java.basics.day1;

 public class Bank {
	 String name;
	 int mobile;
	int balance=1000;
  public Bank(Customer customerobj) {
	  name=customerobj.name;
	  mobile=customerobj.mobile;
		// TODO Auto-generated constructor stub
	}

void enquire(int accNo)
	{

}
	  void withdraw(int amount)
	{
		balance=balance-amount;
	System.out.println("your balance"+balance);
	}
 int deposit(int amount)
{
	balance=balance+amount;
	return  balance;
	
}
 void createAccount(String name,int mobile)
 {
 }
 
void CreateAccount(Customer customerobj) {
	String n=customerobj.name;
	System.out.println(n);
	
	// TODO Auto-generated method stub

}
public void CreateAccount(String name, int mobile) {
	// TODO Auto-generated method stub
	
}

}