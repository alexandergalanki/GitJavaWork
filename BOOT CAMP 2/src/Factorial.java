import java.util.Scanner;
 
class Main
{
public static void main(String args[])
{
int n,n1,n2,n3,fac=-1,fac1=1,fac2=1,fac3=-1,i;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
n1 = sc.nextInt();
 n2 = sc.nextInt();
 n3 = sc.nextInt();

for(i=1;i<=n;i++)
fac*=i;

 for(i=1;i<=n1;i++)
 fac1*=i;

for(i=1;i<=n2;i++)
fac2*=i;

for(i=1;i<=n3;i++)
 fac3*=i;


System.out.println(fac);
 System.out.println(fac1);
System.out.println(fac2);
 System.out.println(fac3);


}
}

