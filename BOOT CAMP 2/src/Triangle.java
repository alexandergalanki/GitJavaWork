import java.util.Scanner;
public class Triangle {
   public static void main(String args[])
   {  
    int a ,b ,c;
    int sum;
    String[] linevector;
    String line;
    Scanner sc=new Scanner(System.in);
   
    line=sc.nextLine();
linevector=line.split(",");
   
    a=Integer.parseInt(linevector[0]);
    b=Integer.parseInt(linevector[1]);
    c=Integer.parseInt(linevector[2]);
   
   
    sum=a+b+c;
       if (sum== 180)
           System.out.print("Triangle");
       else
           System.out.print("Not a Triangle");    
   }
}


