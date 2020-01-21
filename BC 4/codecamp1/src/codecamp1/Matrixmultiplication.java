package codecamp1;
import java.util.Scanner;

public class Matrixmultiplication
{

   public static void main(String args[])
   {
       int n=3;
       Scanner sc = new Scanner(System.in);
         
       int[][] x = new int[n][n];
       int[][] y = new int[n][n];
       int[][] z = new int[n][n];
       System.out.println("Enter the rows and columns  of  1st  3x3 martix \n");
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               x[i][j] = sc.nextInt();
           }
       }
       System.out.println("Enter the rows and columsn  of 2nd  3 x 3 martix \n");
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               y[i][j] = sc.nextInt();
           }
       }
       
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               for (int k = 0; k < n; k++)
               {
                   z[i][j] = z[i][j] + x[i][k] * y[k][j];
               }
           }
       }
       System.out.println("Multiplication of two matrices");
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               System.out.print(z[i][j] + " ");
           }
           System.out.println();
       }
       
   }
}


