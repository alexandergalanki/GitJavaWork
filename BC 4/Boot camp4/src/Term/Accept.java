package Term;

import java.util.Scanner;

public class Accept {

	public static void main(String[] args) {
		//intializing variables
		String s=null;
		String add=null;
		String email=null;
		System.out.println("Enter Your Full Name:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("Enter your Address:");
		add=sc.nextLine();
		System.out.println("Enter your emailid:");
		email=sc.nextLine();
		if(s.isEmpty())//check condition for s is null or not
		{
			if(add.isEmpty())//check condition for add is null or not
			{
				if(email.isEmpty())//check condition for email is null or not
				{
					System.out.println("Your Details\nYour Name is:"+s+"\nYour Address is: " +add+"\nYour emailid is: "+email);
				}else {
					System.out.println("Insufficient Data");
				}
			}else {
				System.out.println("Insufficient Data");
			}
		}else {
			System.out.println("Insufficient Data");
		}
		
		

	}

}
