
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello how are you";
		String []s2 = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
		System.out.println(s2[i]);
		}
		for(int i=0;i<s2.length;i++)
		{
		String first = s2[i].substring(0, 1).toUpperCase()+s2[i].substring(1);	
		System.out.print(first + " ");
		}
		
	}

}
