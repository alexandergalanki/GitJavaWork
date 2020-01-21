package codeCamp2;
import java.util.Scanner;
public class Ten {

    public static void main(String [] args)
           {
                int[] elements= new int [5];
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter 5 array elements:");
                   
               for (int i=0;i<5;i++)  
        {
            elements[i]=sc.nextInt();
              }
               for(int i=0;i<5;i++)
               {
              System.out.println("The obsolute maximum value of " +elements[i]+" is "+Math.abs(elements[i]));
        }
           }
}


