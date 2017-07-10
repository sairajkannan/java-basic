package payilagam.java.basics.day1;

public class Calculator {

	public static void main(String[] args) {
		Calculator casio=new Calculator();
		int result=casio.add(5,4);
		System.out.println(result);
		System.out.println(casio.sub(result,4));
		System.out.println(casio.mul(5,4));
		System.out.println(casio.div(5,4));
	}

	private int mul(int i, int j) {
		int c;
		c=i*j;
	
		return c;
		// TODO Auto-generated method stub
		
	}

	private int add(int i, int j) {
		int c;
		c=i+j;
	
		return c;
		// TODO Auto-generated method stub
		
	}

	private int sub(int i, int j) {
		int c;
		c=i-j;
		
		// TODO Auto-generated method stub
		return c;
		
	}

	private double div(double i,double j) {
		double c;
		c=i/j;
		
		return c;
		// TODO Auto-generated method stub
		
	}

	private void add() {
		// TODO Auto-generated method stub
		int a=5,b=6;
		int c=a*b;
		
		
	}

}
