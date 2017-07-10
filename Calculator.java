import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a , b values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1.add \n" + "2.sub \n"+ "3.mul \n" + "4.div");

		System.out.println("make a choice");
		int s = sc.nextInt();
		switch(s)
		{
		case 1 : 
			int c = a + b ;
			System.out.println(c);
			break;
		case 2 : 
			int d = a - b;
			System.out.println(d);
			break;
		case 3 :
			int e = a*b;
			System.out.println(e);
			break;
		case 4 : 
			int f = a/b;
			System.out.println(f);
			break;



		}
	}

}
