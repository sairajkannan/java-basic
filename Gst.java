import java.util.Scanner;

public class Gst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount ,  gst %");
		int amount = sc.nextInt();
		/*int gstperc = sc.nextInt();
		int gst = (amount*gstperc)/100;
		int total = amount+gst;
		System.out.println(total);*/
		System.out.println("enter a choice of gst ");

		System.out.println("a 5% \n" + "b 12% \n"+ "c 18% \n" + "d 28%");

		String s = sc.next();
		switch(s)
		{
		case "a" : 
			int gst1 = (amount*5)/100;
			int total1 = amount+gst1;
			System.out.println(total1);
			break;
		case "b" : 
			int gst2 = (amount*12)/100;
			int total2 = amount+gst2;
			System.out.println(total2);
			break;
		case "c" : 
			int gst3 = (amount*18)/100;
			int total3 = amount+gst3;
			System.out.println(total3);
			break;
		case "d" : 
			int gst4 = (amount*28)/100;
			int total4 = amount+gst4;
			System.out.println(total4);
			break;
		default: 
				System.out.println("invalid option");

		}
	}

}
