package payilagam.java.basics.day1;

 public class Bank {
	int balance=1000;
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
public int CreateAccount(String name) {
	// TODO Auto-generated method stub
	return 0;
}
public void CreateAccount(String name, Object mobile) {
	// TODO Auto-generated method stub
	
}
}