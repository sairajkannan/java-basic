package payilagam.java.basics.day1;

public class Operation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++)
		{
			if((i%3)==0 && i%5==0)
			{
				System.out.println("bing  bang");
			}
			else if((i%3)==0)
			{
				System.out.println("bing");
			}
			else if(i%5 ==0)
			{
				System.out.println("bang");
			}
			{
				System.out.println(i);
			}
		}

	}

}
