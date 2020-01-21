package codeCamp2;

import java.util.Scanner;

public class Third {
	public static final int PASSWORD_LENGTH = 10;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.A password must have at least ten characters.\n" +

				"2. A password consists of only letters and digits.\n" +

				"3.A password must contain at least two digits.\n"
				+ "Input a password(you are agreeing to the above terms and conditions)");
		String s = sc.nextLine();
		if (is_Valid_Password(s)) {
			System.out.println("password is valid" + s);
		} else {
			System.out.println("Not a valid password");
		}
	}

public static boolean is_Valid_Password(String Password)
{
	if(Password.length()<PASSWORD_LENGTH)
return false;
	int charCount=0;
	int numCount=0;
	for(int i=0;i<Password.length();i++)
	{
		char ch=Password.charAt(i);
		if(is_Numeric(ch))
		
			numCount++;
		
		else if(is_Letter(ch))
		
		charCount++;
		else 
			return false;
	}
	return(charCount>=2 && numCount>=2);
}

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'z');
	}

	public static boolean is_Numeric(char ch)

	{
		return (ch >= '0' && ch <= '9');

	}

}
