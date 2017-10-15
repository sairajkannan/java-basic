import java.util.Scanner;


public class Password {
	String name="JAVa";
	boolean check8char()
	{
		if(name.length() <8)
			return false;
		
		return true;
		
	}
boolean chechupper()
{
char n[]=name.toCharArray();
for(int i=0;i<n.length;i++){
	if(Character.isUpperCase(n[i]))
		return true;
	
}
return false;


}
boolean checksplchar()
{
	char n[]=name.toCharArray();
	for(int i=0;i<n.length;i++){
		if(!Character.isLetter(n[i]))
				return true;
	}
	return false;
}
void checknum()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password c=new Password();
		boolean a=c.chechupper();
		boolean b=	c.check8char();
		boolean	 d=c.checksplchar(); 
		
System.out.println(a);
System.out.println(b);
System.out.println(d);
	}

}
