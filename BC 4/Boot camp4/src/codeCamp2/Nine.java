package codeCamp2;

import java.util.Scanner;

public class Nine {
public static void main(String args[]) {
	String reverse="";
	int len;
	System.out.println("enter string to reverse :");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	len=str.length();
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
		
	}
	System.out.println("Reversed string is:");
	System.out.println(reverse);
	System.out.println("Length of Entered String is:"+len);
	
	
}
}
