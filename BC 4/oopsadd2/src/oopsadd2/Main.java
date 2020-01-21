package oopsadd2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
     public static void main(String[] args) throws IOException 
     {
         InputStreamReader in= new InputStreamReader(System.in);
         BufferedReader br= new BufferedReader(in);
    	
		System.out.println("Enter the number of contact-address pair:");
		int n= Integer.parseInt(br.readLine());
		String[] s= new String[n];
		String[] u= new String[n];
	
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the address "+(i+1)+":");
		s[i]=br.readLine();
		
		System.out.println("Enter the contact "+(i+1)+":");
		u[i]= br.readLine();
		
		}

		String a[]= s[0].split(",");
		String b[]= u[0].split(",");
		String c[]= s[1].split(",");
		String d[]= u[1].split(",");
		
		Address x= new Address(a[1],a[0],a[2],a[3],Integer.parseInt(a[4]));
		Contact t= new Contact(Integer.parseInt(b[0]),Integer.parseInt(b[1]),Integer.parseInt(b[2]),b[3]);

		Address y= new Address(c[1],c[0],c[2],c[3],Integer.parseInt(c[4]));
		Contact v= new Contact(Integer.parseInt(d[0]),Integer.parseInt(d[1]),Integer.parseInt(d[2]),d[3]);
		
		System.out.println("Enter the mobile of the contact to be searched:");
		int r= Integer.parseInt(br.readLine());
		
		if(Integer.parseInt(b[0])==r || Integer.parseInt(b[1])==r || Integer.parseInt(b[2])==r)
		{
			System.out.println("Contact-Address 1");
			System.out.println(t);
			System.out.println(x);
		if(Integer.parseInt(d[0])==r || Integer.parseInt(d[1])==r || Integer.parseInt(d[2])==r)
		{
			System.out.println("Contact-Address 2");
			System.out.println(v);
			System.out.println(y);
		}
		/*if(Integer.parseInt(d[0])==r || Integer.parseInt(d[1])==r || Integer.parseInt(d[2])==r)
		{
			System.out.println("Contact-Address 3");
			System.out.println(v);
			System.out.println(y);
		}*/
		}
		else
		{
			System.out.println("No contact with mobile "+r+" found");
		}
	}

}
