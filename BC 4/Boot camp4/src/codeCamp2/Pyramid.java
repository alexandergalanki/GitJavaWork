package codeCamp2;
import java.util.Scanner;
public class Pyramid {

	    public static void main(String args[]) {
	    int num;
	    	System.out.println("Pyramid pattern of star in Java : ");
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter number of rows");
	       num=sc.nextInt();
	        for (int i = 1; i < num; i++) {
	            for (int j = 1; j < num - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k!=(2*i)-1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	    
	}
