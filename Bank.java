package javaprogram;

import java.util.Scanner;

public class Bank {
	int balance=1000;
	public static void main(String[] args) {
		
		
		Bank sbi=new Bank();
		
		// TODO Auto-generated method stub
		System.out.println("enter amount for withdraw");
		Scanner s=new Scanner(System.in);
		int withdrwamo=s.nextInt();
		System.out.println("enter the amount for deposite");
		int depoamo=s.nextInt();
		sbi.deposite(depoamo);
		sbi.withdraw(withdrwamo);
		
	}

	private void withdraw(int amount) {
	
		balance=balance+amount;
		System.out.println(balance);
		// TODO Auto-generated method stub
		
	}

	private void deposite(int amount) {

		balance=balance-amount;
		System.out.println(balance);
		// TODO Auto-generated method stub
		
	}

}
