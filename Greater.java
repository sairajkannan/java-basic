import java.util.*;
public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a , b, c values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a>=b) && (a>=c))
		{
			System.out.println("a = " +c + "  is greater");
		}
		else if((b>=a) && (b>=c))
		{
			System.out.println("b = "+ b +"  is greater");
		}
		else
		{
			System.out.println("c  = "  + c +"  is greater");
		}
		

	}

}
