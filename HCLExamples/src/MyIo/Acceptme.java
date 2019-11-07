package MyIo;

import java.util.Scanner;

public class Acceptme {
	
public static void main(String args[])
	{
		String name;
		int id;
		float salary;
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the name :");
		name =s.nextLine();
		System.out.println("Enter the id :");
		id = s.nextInt();
		System.out.println("Enter the salary ;");
		salary = s.nextFloat();
		System.out.println("name is "+name);
		System.out.println("id is "+id);
		System.out.println("salary is "+salary);
	}
		
		
	}
	
	


