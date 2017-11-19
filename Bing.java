import java.util.Scanner;


public class Bing {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
		System.out.println("enter the number:");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		Bing st=new Bing();
		st.getValue(a);
		// TODO Auto-generated method stub

	}

}

	private void getValue(int a) {
		if(a%5==0&&a%3==0)
		{
			System.out.println("bing bang");
		}
		else if(a%3==0)
		{
		System.out.println("bing");
		}
		else if(a%5==0)
		{
		System.out.println("bang");
		}
		else
		{
			System.out.println("invalid");
		}
	}
		// TODO Auto-generated method stub
		
	}
