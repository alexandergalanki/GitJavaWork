package oop;

import java.util.Scanner;

public class Branch {
	public static void main(String args[]) 
	{
		int bankid;
		String Locid;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bank Id:   ");
		bankid=sc.nextInt();
		System.out.println("Enter the Location Id:   ");
		Locid=sc.next();
		
		
		System.out.println("The Bank Id is :  "+bankid);
		System.out.println("The Location Id is :  "+Locid);
		
	}

}
