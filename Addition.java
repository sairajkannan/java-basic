
public class Addition {
	int a;
	Addition(int a,int b)
	{
		System.out.println();
	}

	public static void main(String[] args) {
		Addition a=new Addition(2,3);
		a.param(2, 3);
		a.nonparam();
		// TODO Auto-generated method stub

	}
     void nonparam() {
		int a=10,b=20;
		int d=a+b;
		System.out.println(d);
		// TODO Auto-generated method stub
		
	}

	 void param(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
		// TODO Auto-generated method stub
		
	}

}
