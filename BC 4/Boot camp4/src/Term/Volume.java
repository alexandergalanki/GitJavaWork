package Term;

import java.util.Scanner;

public class Volume {//creating volume class 
	static void vol(int c)//creating volume method for cube
	{
		double vol=c*c*c;
		System.out.println("Volume of cube is:"+vol);
	}
static void vol(float r)//creating volume method for sphere
{
	double vol=(4*22*r*r*r)/(3*7);
	System.out.println("Volume of sphere is:"+vol);
}
static void vol(int l,int b,int h)//creating volume method for triangle
{
	double vol=l*b*h;
	System.out.println("Volume of triangle is:"+vol);
}
	public static void main(String[] args) {
		int choice ,len,bre,hei;
		float radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Volume of Cube"+"\n2.Volume of Sphere"+"\n3.Volume of Triangle");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)//Switch loop for selecting choice 
		{
		case 1:
			System.out.println("Enter the length:");
			len=sc.nextInt();
			vol(len);
			break;
		case 2:
			System.out.println("Enter the radius:");
			radius=sc.nextFloat();
			vol(radius);
			break;
		case 3:
			System.out.println("Enter the length:");
			len=sc.nextInt();
			System.out.println("Enter the breath:");
			bre=sc.nextInt();
			System.out.println("Enter the heigth:");
			hei=sc.nextInt();
			vol(len,bre,hei);
			break;
			default:
				System.out.println("Invalid choice");
				break;
		}
		

	}

}
