import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) {
  
  Scanner scan= new Scanner(System.in);
  
  System.out.println("Enter the Cricket Format\r\n1.ODI\r\n2.T20\r\n3.Test");
  int n= Integer.parseInt(scan.nextLine());
  if(n==1)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(scan.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(scan.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(scan.nextLine());
   Match Odi= new Odi(score, currentOver, target);
   System.out.println("Requirements:");
   Odi.display();
  }
  else if(n==2)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(scan.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(scan.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(scan.nextLine());
   Match Ttwenty= new Ttwenty(score, currentOver, target);
   
   System.out.println("Requirements:");
   Ttwenty.display();
  }
  else if(n==3)
  {
   System.out.println("Enter the Current Score");
   int score= Integer.parseInt(scan.nextLine());
   System.out.println("Enter the Current over");
   float currentOver= Float.parseFloat(scan.nextLine());
   System.out.println("Enter the Target");
   int target= Integer.parseInt(scan.nextLine());
   Match test= new Test(score, currentOver, target);
   System.out.println("Requirements:");
   test.display();
  }
  else
  {
   System.out.println("Invalid Format typ");
  }
 }
}