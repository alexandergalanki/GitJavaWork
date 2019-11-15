import java.util.Scanner;
import static java.lang.System.out;
public class Main 
{
	String Book;
	String getName() {
		return getName();
	} 
	String getDetails() {
		return getDetails();
	} public void StallCategory()
{

String sc = Book;
out.println("Details of the stall category:");
out.print("Name:"+sc.getName());
out.print("Details:"+sc.getDetails());
}

public static void main(String[] args) 
{
Scanner s =new Scanner(System.in);

StallCategory sc=new StallCategory();
out.println("Enter the name of the stall category:");
sc.setName(s.nextLine());
out.println("Enter the details of the stall category:");
sc.setDetail(s.nextLine());

display (sc);

}
public static void display(StallCategory sc)

{
out.println("Using Default Constructor");
out.println("Details of the stall category:");
out.println("Name:"+sc.getName());
out.println("Details:"+sc.getDetail());

out.println("Using Parameterised Constructor");
out.println("Details of the stall category:");
out.println("Name:"+sc.getName());
out.println("Details:"+sc.getDetail());
}
}

