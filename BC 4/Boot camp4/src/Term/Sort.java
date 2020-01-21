package Term;

import java.util.Scanner;

public class Sort {
	public static void main(String []args) {
	    int num, x, y, temp;//initializing elements
	    Scanner sc = new Scanner(System.in);//taking input from user
	 
	    System.out.println("Enter no.of integers to be sorted:");//message for the user
	    num = sc.nextInt();//assigning elements to num variable
	 
	    int array[] = new int[num];//creating array for num
	 
	    System.out.println("Enter " + num + " integers: ");
	 
	    for (x = 0;x < num;x++) //loop for taking the elements into array
	      array[x] = sc.nextInt();
	 
	    for (x = 0; x < ( num - 1 ); x++) {//loop for sorting
	      for (y = 0; y < num - x - 1; y++) {
	        if (array[y] > array[y+1]) 
	        {
	           temp = array[y];
	           array[y] = array[y+1];
	           array[y+1] = temp;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of integers:");
	 
	    for (x = 0; x < num;x++) //loop for printing the elements
	      System.out.println(array[x]);
	  }
	}
