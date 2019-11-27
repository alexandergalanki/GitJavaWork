import java.util.Scanner;
public class Transpose {

   public static void main(String args[])
   {
       int i, j,k;
       int arr[][] = new int[3][3];
       int arr1[][]=new int[3][3];
       int arrt[][] = new int[3][3];
       int arrm[][]=new int[3][3];
       Scanner scan = new Scanner(System.in);
   
      // System.out.print("Enter 3*3 Array1 Elements : ");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
     //  System.out.print("Enter 3*3 Array2 Elements : ");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               arr1[i][j] = scan.nextInt();
           }
       }
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               arrt[i][j] = arr[j][i];
           }
       }
      
      
   
       System.out.print("Transpose of the first Matrix is :\n");
       for(i=0; i<3; i++)
       {
           for(j=0; j<3; j++)
           {
               System.out.print(arrt[i][j]+ " ");
           }
           System.out.println();
       }
   
       System.out.println("Two marix multiplication is");
       for (i = 0; i < 3; i++) {
           for (j = 0; j < 3; j++) {
               for (k = 0; k < 3; k++) {
                   arrm[i][j] += arr[i][k] * arr1[k][j];
               }
           }
       }
       
      
       for (i = 0; i < 3; i++) {
           for (j = 0; j < 3; j++) {
               System.out.print(arrm[i][j] + " ");
           }
           System.out.print("\n");
       }
      
   }
  
}