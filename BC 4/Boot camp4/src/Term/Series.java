package Term;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		int i,s=0,x=3;//initializing elements
		System.out.println("Enter the no.of elements to be printed");//message for the user
		Scanner sc=new Scanner(System.in);//taking input from user
		i=sc.nextInt();
		for(int n=0;n<i;n++)//loop for iteration
		{
			System.out.print(s);//print statement to print the elements
			s = s + x;
			x = x + 2;
			if(n<i-1)
			{
				System.out.print(",");
				
			}else
				System.out.print(".");
		}

	}

}
