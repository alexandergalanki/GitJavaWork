package codeCamp2;
import java.util.Scanner;
public class Nineee {
public static void main(String[] args)
{
String str[]=new String[10];
System.out.println("Enter 10 Strings");
Scanner sc=new Scanner(System.in);
for(int k=0;k<10;k++)
{
str[k]=sc.next();
}
for(int k=0;k<10;k++)
{
System.out.println("The length of string is "+str[k].length());
StringBuilder sb=new StringBuilder(str[k]);
System.out.println("The reverse of string is "+sb.reverse().toString());
}
}

}

