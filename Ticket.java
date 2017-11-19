import java.util.Scanner;


public class Ticket {

	public static void main(String[] args) {
		for(int i=0;i<2;i++)
		{
		System.out.println("enter name:");
		System.out.println("enter age:");
		System.out.println("enter amount:");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		int age=scan.nextInt();
		int amount=scan.nextInt();
		
	
	if(age<18)
	{
		int changeamount1 = (amount)*50/100;
		System.out.println(changeamount1);
	}
	else if(age>=18)
	{
		int changeamount11 = (amount)*100/100;
		System.out.println(changeamount11);
	}
	else if(age>60)
	{
		int changeamount2 = (amount)*50/100;
		System.out.println(changeamount2);
	}
		
		}

	

}
}
