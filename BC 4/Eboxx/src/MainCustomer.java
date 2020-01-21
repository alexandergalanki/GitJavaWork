import java.util.Scanner;

public class MainCustomer {

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		String uName= sc.next();
		System.out.println("Enter Password :");
		String password= sc.next();
		
		Customer cu= new Customer(uName,password);
		
		if(password.length()>5)
		{
			//System.out.println(sb.charAt(4));
			if((password.charAt(4)=='a' || password.charAt(4)=='e'||password.charAt(4)=='i' ||password.charAt(4)=='o'||password.charAt(4)=='u'))
			{
				System.out.println("Strong password");
			}
			else
				System.out.println("Weak password");
		}
		else
			System.out.println("Weak password");

	}
}

