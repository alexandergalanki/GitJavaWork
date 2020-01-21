package codecamp1;

import java.util.Scanner;

public  class Squ extends Shape  {
	
	
	double perimeter,area;
	private double sq;
	Squ(double sq)
	{

       this.sq=sq;
	}
	
	
	
	
	@Override
	
	 void   getPerimeter( )
	{
		
		//Perimeter of a Square
		
		System.out.println("\t\t\tSqaure");
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the perimeter  value of a in square : ");
		double a=sc.nextDouble();
		double perimeter=4*a;
		System.out.println("The perimter of the square is : "+perimeter);
		
		
		
	}
	
	@Override
	
	void getArea()
	{
		System.out.println("  ");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the side value of a");
		double a1=sc.nextDouble();
		double area=Math.sqrt(a1);
		System.out.println("The area of the square is : "+area);
		
	}
	
//	void display()
//	{
//		
//		
//		System.out.println("The perimter of the square is : "+perimeter);
//		
//		System.out.println("The area is : "+area);
//	}
	
	
	
	
}
	
	
	
	
	
