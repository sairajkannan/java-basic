package payilagam.java.basics.day1;

public class GreaterOfThreeNumber {

	public static void main(String[] args) {
		int f=5,s=2,t=5;
		if(f>s)
		{
			if(f>t)
			{
				System.out.println("FIRST");
			}
			else if(t>f)
			{
				System.out.println("THIRD");
			}
			else
			{
				System.out.println("FIRST&THIRD");
			}
		}
			else if(s>f)
			{
				if(s >t)
				{
				 System.out.println("SECOND");
			    }
				else if(s<t)
				{
					System.out.println("THIRD");
				}
				else
				{
					System.out.println("SECOND&THIRD");
				}
			}
				else if(t>f)
				{
					System.out.println("THIRD");
				}
				else if (t<f)
				{
					System.out.println("FIRST&SECOND");
				}
				else
				{
					System.out.println("ALL ARE EQUAL");
				}
		
		// TODO Auto-generated method stub

	

}
	}
