import java.util.Scanner;
import static java.lang.System.out;
public class StallCategory 
{
	static String Book;
	String getName(String string) {
		return getName(string);
		}
	
	String getDetails(String string) 
	{
		return getDetails(string);
	}
		
	 
public void StallCategory()
{

String sc = Book;
out.println("Details of the stall category:");
out.print("Name:"+sc.getName(Book));
out.print("Details:"+sc.getDetails(Book));
}
public static void main(String[] args) 
{
Scanner s =new Scanner(System.in);

StallCategory sc=new StallCategory();
out.println("Enter the name of the stall category:");
sc.getName(s.nextLine());
out.println("Enter the details of the stall category:");
sc.getDetails(s.nextLine());

display (sc);

}
public static void display(StallCategory sc)

{
out.println("Using Default Constructor");
out.println("Details of the stall category:");
out.println("Name:"+sc.getName(Book));
out.println("Details:"+sc.getDetails(Book));

out.println("Using Parameterised Constructor");
out.println("Details of the stall category:");
out.println("Name:"+sc.getName(Book));
out.println("Details:"+sc.getDetails(Book));
}
}


