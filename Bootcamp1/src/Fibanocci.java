import java.util.Scanner;

public class Fibanocci {
public static void main(String args[])  
{    
int n;
System.out.println("n=");
Scanner sc=new Scanner (System.in);
int a=1;
int b=0;
n=sc.nextInt();

for(int i=0;i<n;i++)
{
System.out.print(b);
b=a+b;
a=b-a;
if(i<=n-2)
{
System.out.print(" ");
}
}
}
}
