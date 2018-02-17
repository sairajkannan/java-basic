package afzal;

import java.util.Scanner;

public class ElectronicShop {
	String name;
	String mobileNo;
	 double price;
	 double discount;
	 ElectronicShop()
	{
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter name:");
		 name=sc.next();
			System.out.println("enter mobileNo:");
		 mobileNo=sc.next();
		 System.out.println("enter price:");
		price=sc.nextDouble();
		discount = 0;
	}
	public static void main(String[] args) {
	
	
		

			
		ElectronicShop obj=new ElectronicShop();
		 
		
		if(obj.price<25000)
		{
			obj.discount = (obj.price)*5/100;	
		}
		else if(obj.price>=25001 && obj.price<=50000)
		{
			obj.discount = (obj.price)*7.5/100;

			}
		else if(obj.price>=50001 &&obj.price<=100000)
		{
			obj.discount = (obj.price)*10/100;
			}
		else if(obj.price>100000)
		{
			obj.discount = (obj.price)*15/100;
	
		}
		double amount=obj.price-obj.discount;
		{
			System.out.println("total amount:"+amount);
		}
		
		}
	  private static void diwalioffer() {
		  
		  
		
	
	
		// TODO Auto-generated method stub
		
	}


}
