package payilagam.java.basics.day1;

public class Bank {
	int balance=1000;
protected void enquire(int accNo)
	{

}
protected void withdraw(int amount)
	{
		balance=balance-amount;
	System.out.println("your balance"+balance);
	}
protected int deposit(int amount)
{
	balance=balance+amount;
	return  balance;
	
}
}