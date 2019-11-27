import java.util.Scanner;

public class Samples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long acct_no;
		String customer_name, trans_type;
		double trans_amount, bal_amount;
		Scanner sc = new Scanner(System.in);        // reading input from keyboard
		System.out.println("Enter Customer Name");
		customer_name = sc.next();
		System.out.println("Enter Account Number");
		acct_no = sc.nextLong();
		System.out.println("Enter Transtion Type");
		trans_type = sc.next();
		System.out.println("Enter Trans Amount");
		trans_amount = sc.nextLong();
		System.out.println("Enter Balance");
		bal_amount = sc.nextDouble();
		Bank b = new Bank(acct_no, customer_name, trans_type, trans_amount, bal_amount); // crating obj and sending variable details
		b.transaction();  // calling method

	}

}

class Bank {
	private long acct_no; // Declaring variables
	private String customer_name, trans_type;
	private double trans_amount, bal_amount;

	public Bank(long acct_no, String customer_name, String trans_type, double trans_amount, double bal_amount) { // Constructor
																													// to
																													// initialize
																													// the
																													// variables
		super();
		this.acct_no = acct_no;
		this.customer_name = customer_name;
		this.trans_type = trans_type;
		this.trans_amount = trans_amount;
		this.bal_amount = bal_amount;
	}

	public void transaction() // creating the method
	{
		double amount = 0;
		if (trans_type.equals("withdrawal")) { //  checking condition trans is withdral or not
			if (trans_amount <= bal_amount) {  //checking if sufficient amount is avilable in your acc or not
				amount = bal_amount - trans_amount;   // removing tra amount from available balance
				
			} else {
				System.out.println("invaid transaction");
			}
		}
		if (trans_type.equals("deposit")) {  // checking the condition for deposit
			amount = bal_amount + trans_amount;  //adding the amount to balance
			
		}
		System.out.println("Customer Name :" + customer_name);
		System.out.println("Account Number :" + acct_no);
		System.out.println("Transtion Type :" + trans_type);
		System.out.println("Trans Amount :" + trans_amount);
		System.out.println("Balance Amount : " + bal_amount);
		System.out.println("New Balance" + amount);

	}
}
