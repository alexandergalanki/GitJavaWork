package codecamp1;

import java.util.Scanner;

public class Circle extends Shape {
	
	
	double perimeter,area;
	private double c;
	Circle(double c)
	{
		this.c=c;
		
	}
	@Override
	
	 void   getPerimeter( )
	{
		
		//Perimeter of a circle
		System.out.println("  ");
		System.out.println("\t\t\tCircle ");
		System.out.println("  ");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the side value of r");
		double r=sc.nextDouble();
		double perimeter= 2*3.14*r*r;
		System.out.println("The perimter of the circle is : "+perimeter);
		
		
		
	}
	
	@Override
	
	void getArea()
	
	
	{
		System.out.println("  ");
		//Area of the square
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the side value of r");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("The area of the circle is : "+area);
	}
	
}


