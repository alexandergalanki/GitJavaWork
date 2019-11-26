import java.util.Scanner;

public class PrimeNumber {


public static void main(String args[])
{
int n;
boolean isPrime=true;

Scanner sc =new Scanner(System.in);
System.out.println("Input any Integer : ");
n=sc.nextInt();

for(int i=2;i<=n/2;i++)
{
         int  temp=n%i;
  if(temp==0)
  {
     isPrime=false;
     break;
  }
}
//If isPrime is true then the number is prime else not
if(isPrime)
  System.out.println(n+ "p");

  }
}

