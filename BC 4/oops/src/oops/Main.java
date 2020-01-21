package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String...strings)throws IOException
	{
		int n=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of users:");
		n=Integer.parseInt(br.readLine());
		
		User[] userlist=new User[n];
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("User"+i+"\n"+"Name:");
			userlist[i-1].setName(br.readLine());
			System.out.println("contactNumber"+i+"\n"+"Name:");
			userlist[i-1].setcontactNumber(br.readLine());
			n--;
		}
	}

}
