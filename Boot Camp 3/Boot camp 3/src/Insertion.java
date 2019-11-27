import java.util.Scanner;
public class Insertion
{
   public static void main(String[] args)
   {
       int n, p, x;
       Scanner s = new Scanner(System.in);
       n =5;
       int a[] = new int[n+1];
       System.out.print("Input array elements: ");
       for(int i = 0; i < n; i++)
       {
           a[i] = s.nextInt();
       }
       System.out.print("Input the position to insert: ");
       p = s.nextInt();
       x = 50;
       for(int i = (n-1); i >= (p-1); i--)
       {
           a[i+1] = a[i];
       }
       a[p-1] = x;
       System.out.print("Array after insertion: ");
       for(int i = 0; i < 3; i++)
       {
           System.out.print(""+a[i]+" ");
       }

   }
}