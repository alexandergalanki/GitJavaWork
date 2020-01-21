package codecamp1;

import java.util.Scanner;

public  class Pentagon extends Shape  {
	
	double perimeter,area;
	private double pe;
	Pentagon(double pe)
	{
		this.pe=pe;
		
	}
	
	
	@Override
	
	 void   getPerimeter( )
	{
		
		//Perimeter of a Square
		System.out.println("  ");
		System.out.println("\t\t\tpenatgon");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the side value of a");
		double a2=sc.nextDouble();
		double perimeter=5*a2;
		System.out.println("The perimter of the pentagon is : "+perimeter);
		
		
		
	}
	
	@Override
	
	void getArea()
	{
		System.out.println("  ");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the side value of a");
		double a3=sc.nextDouble();
		double area=(1.7204)*a3*a3;
		System.out.println("The area of the pentagon is : "+area);
		
	}
	
}
	