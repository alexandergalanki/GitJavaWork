package codeCamp2;
import java.util.Scanner;
import java.util.Arrays;
public class First {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] Digitallogic=new int[6];
int[] Networking=new int[6];
int[]  java=new int[6];
int[] Digitallogic1=new int[3];
int[] Networking1=new int[3];
int[]  java1=new int[3];
System.out.println("Marks for scholars in ECP-01");
System.out.println("Enter the marks for digitallogic");
for(int k=0;k<3;k++)
{
Digitallogic[k]=sc.nextInt();
}
System.out.println("Enter the marks for Networking");
for(int k=0;k<3;k++)
{
Networking[k]=sc.nextInt();
}
System.out.println("Enter the marks for java");
for(int k=0;k<3;k++)
{
java[k]=sc.nextInt();
}
System.out.println("Marks for scholars in ECP-02");
System.out.println("Enter the marks for digitallogic");
for(int k=0;k<3;k++)
{
Digitallogic1[k]=sc.nextInt();
}
System.out.println("Enter the marks for Networking");
for(int k=0;k<3;k++)
{
Networking1[k]=sc.nextInt();
}
System.out.println("Enter the marks for java");
for(int k=0;k<3;k++)
{
java1[k]=sc.nextInt();
}
System.out.println("Average marks for scholars in ECP-01 ");
float digiavg=average(Digitallogic);
System.out.println("Average Digital Logic marks:"+digiavg);

float netavg=average(Networking);
System.out.println("Average Networking marks:"+netavg);

float javaavg=average(java);
System.out.println("Average JAVA marks:"+javaavg);

System.out.println("Average Marks for scholars in ECP-01");

float digi1avg=average(Digitallogic1);
System.out.println("Average Digital Logic marks:"+digi1avg);

float net1avg=average(Networking1);
System.out.println("Average Networking marks:"+net1avg);

float java1avg=average(java1);
System.out.println("Average JAVA marks:"+java1avg); }


public static float average(int[] array)
{

int sum=0;
float avg;
int marks[]=new int[3];
int temp=0;
for(int k=0;k<3;k++)
{
sum=sum+array[k];
}
avg=sum/3;
return avg;
}
}








