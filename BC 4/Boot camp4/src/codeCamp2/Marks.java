package codeCamp2;

import java.util.Scanner;
public class Marks
{
public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
	Scanner sc=new Scanner(System.in);
	
	int[] physics=new int[6];
	int[] chemistry=new int[6];
	int[] maths=new int[6];
	
	int[] physics1=new int[3];
	int[] chemistry1=new int[3];
	int[] maths1=new int[3];
	
	System.out.println("Marks for scholars in ECP-01");
	System.out.println("Enter the marks for physics:");
	for(int i=0;i<3;i++)
	{
		physics[i]=sc.nextInt();
	}
	System.out.println("Enter the marks for Chemistry:");
	for(int i=0;i<3;i++)
	{
		chemistry[i]=sc.nextInt();
	}
	System.out.println("Enter the marks for Maths:");
	for(int i=0;i<3;i++)
	{
		maths[i]=sc.nextInt();
	}
	
	
	System.out.println("Marks for scholars in ECP-02");
	System.out.println("Enter the marks for physics:");
	for(int i=0;i<3;i++)
	{
		physics1[i]=sc.nextInt();
	}
	System.out.println("Enter the marks for Chemistry:");
	for(int i=0;i<3;i++)
	{
		chemistry1[i]=sc.nextInt();
	}
	System.out.println("Enter the marks for Maths:");
	for(int i=0;i<3;i++)
	{
		maths1[i]=sc.nextInt();
	}
	
	System.out.println("Highest Marks for scholars in ECP-01");
	
	int phyhigh=highest(physics);
	System.out.println("Highest physics marks:"+phyhigh);
	
	int chemhigh=highest(chemistry);
	System.out.println("Highest Chemistry marks:"+chemhigh);
	
	int mathhigh=highest(maths);
	System.out.println("Highest Maths marks:"+mathhigh);
	
	System.out.println("Highest Marks for scholars in ECP-01");
	
	int phy1high=highest(physics1);
	System.out.println("Highest physics marks:"+phy1high);
	
	int chem1high=highest(chemistry1);
	System.out.println("Highest Chemistry marks:"+chem1high);
	
	int math1high=highest(maths1);
	System.out.println("Highest Maths marks:"+math1high);
	}
	
	public static int highest(int[] array)
{	
	
	int marks[]=new int[3];
	int temp=0;
	for(int i=0;i<3;i++)
	{
		for(int j=i+1;j<3;i++)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	marks[i]=array[i];
	}
	return marks[0];
}
}

