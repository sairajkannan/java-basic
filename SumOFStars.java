package payilagam.java.basics.day1;

public class SumOFStars {
 
	
	public static void main(String[] args) {
		
		
		for(int row1=1;row1<=3;row1++)
		{
			for(int column1=0;column1<row1;column1++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
			for(int row1=1;row1<=3;row1++)
			{
				for(int column1=2;column1>=row1;column1--)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		}
		// TODO Auto-generated method stub
		
	}


