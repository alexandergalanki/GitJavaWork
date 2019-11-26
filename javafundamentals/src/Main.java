import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

public static void main(String[] args)
{
String name="";
String type="";
int people;
char paid;
double money;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the event");
name=sc.nextLine();
System.out.println("Enter the type of the event");
type=sc.nextLine();
System.out.println("Enter the number of people expected");
people=sc.nextInt();
System.out.println("Is it a paid entry? (Type Y or N)");
paid=sc.next().charAt(0);
System.out.println("Enter the projected expenses (in lakhs) for this event");
DecimalFormat   df= new DecimalFormat("##.#");
money=sc.nextDouble();

System.out.println("Event Name:"+name);
System.out.println("Event Type:"+type);
System.out.println("Expected Count:"+people);
System.out.println("Paid Entry:"+paid);
System.out.println("Projected Expense:"+df.format(money)+"L");

}


}
