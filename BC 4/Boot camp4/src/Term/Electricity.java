package Term;

import java.util.Scanner;

public class Electricity {
	private static Scanner sc;
	  public static void main(String[] args)
	  {
	   
	   int Units; 
	   double BillAmount,FinalAmount;
	   sc = new Scanner(System.in);
	    System.out.print("Please Enter the Units that you Consumed  : ");//message for user
	   Units = sc.nextInt();
	  
	   BillAmount = Electricity(Units);
	   System.out.println("Bill amount:Rs." + BillAmount);
	   FinalAmount=BillAmount+(0.1475)+250;
	   System.out.println("Final bill with tax and meter rent "+FinalAmount);
	  }
	  public static double Electricity(int Units)
	  {
	   double Amount,  BillAmount;
	   if (Units <=100)
	     {  
	          Amount = Units * 3.25;
	          
	     }
	     else if (Units>100 && Units<= 300)
	     {
	      Amount = Units * 4.75;
	      
	     }
	     else 
	     {
	      Amount = Units * 6.35;
	       
	     }
	  
	   
	   BillAmount = Amount;
	   return BillAmount;
	  }
	 }


