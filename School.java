import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		int t,e,m,s,ss;
		Scanner scan = new Scanner(System.in);
		 t=scan.nextInt();
		 e=scan.nextInt();
		 m=scan.nextInt();
		 s=scan.nextInt();
		 ss=scan.nextInt();
		 School school=new School();
		 school.CalculateTotal(t,e,m,s,ss);
		
		// TODO Auto-generated method stub

	}

	 void CalculateTotal(int t, int e, int m, int s, int ss) {
		int total=t+e+m+s+ss;
		System.out.println(total);
		// TODO Auto-generated method stub
		
	}

}
