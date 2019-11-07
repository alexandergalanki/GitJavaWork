//package javafundamentals;

public class Starr
{

public static void main(String[] args) 
{
 int i, j, k;
for(i=3;i>=1;i--)
{
for(j=3;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
}
}