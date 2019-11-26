import java.util.Scanner;

public class Oranges {
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
         int oranges;        
         int gross=0;        
         int aboveGross;                      
         int dozens;      
         int extras;                
         System.out.print("Enter number of oranges: ");
         oranges = sc.nextInt();
        if(oranges!=0) {
         gross = oranges / 144;
         aboveGross = oranges % 144;
         
         dozens = aboveGross / 12;
         extras = aboveGross % 12;          
       
System.out.println("Your number of oranges is "+gross+" gross,"+dozens+" dozen, and "+extras+".");
      }  
      }
   }  