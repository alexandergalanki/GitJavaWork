package codeCamp2;

import java.util.Scanner;

public class Second {
	public static void main(String[] args)
	{
	boolean flag=false;
	int[] array1=new int[5];
	int[] array2=new int[5];
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter First array elements");
	for(int i=0;i<5;i++)
	{
	array1[i]=sc.nextInt();
	}

	System.out.println("Enter Second array elements");
	for(int i=0;i<5;i++)
	{
	array2[i]=sc.nextInt();
	}
		for(int i=0;i<5;i++)
	{
	for(int j=0;j<5;j++)
	{
	if(array1[i]==array2[j])
	{
		flag=true;
	System.out.println("common element is "+array1[i]);
	
	break;
	}
	}
	if(!flag)
	{
		System.out.println("Distinct elements"+array1[i]);
System.out.println("Distinct elements"+array2[i]);
	}

	}
	}
}