package codeCamp2;
import java.util.Scanner;
public class Six {
public static void main(String args[])
{
	int m,year,week,day;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of days:");
	m=sc.nextInt();
	year=m/365;
	m=m%365;
System.out.println("no of years:"+year);
week=m/7;
m=m%7;
System.out.println("No of weeks:"+week);
day=m;
System.out.println("no of days:"+day);
}
}
