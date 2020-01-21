package codeCamp2;
import java.util.Scanner;
public class Eight {
public static int getSmallestNumber(int a[])
{
	Scanner sc=new Scanner(System.in);
System.out.println("please enter the size of array:");
int c=sc.nextInt();
int t=0;
{
	for(int x=0;x<c;x++)
	{
		for(int y=x+1;y<c;y++)
		{
			if(a[x]>a[y])
			{
				t=a[x];
			a[x]=a[y];
			a[y]=t;
			}
		}
	}
}
		return a[0];
		
	}
	public static void main(String args[])
	{
	int a[]= {1,3,5,7,9,11,13,15,17,19};
	System.out.println("Smallest value of the given array is:"+getSmallestNumber(a));
	}
}



