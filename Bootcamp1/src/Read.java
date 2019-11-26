import java.lang.*;
import java.util.Scanner; 
  
class Read{ 
      
    // Return the integer with have 
    // no negative value. 
    static int findInteger(int arr[], int n) 
    { 
        int neg = 0, pos = 0; 
        int sum = 0; 
      
        for (int i = 0; i < n; i++) 
        { 
            sum += arr[i]; 
      
            // If negative, then increment 
            // neg count. 
            if (arr[i] < 0)  
                neg++;  
      
            // Else increment pos count.. 
            else
                pos++;  
        } 
      
        return (sum / Math.abs(neg - pos)); 
    } 
      
    // Driven Program 
    public static void main(String[] args) 
    { 
    	Scanner sc=new Scanner(System.in);
    	
    	
          
        int arr[] = new int[]{ 1, 8, -6, -1, 6, 8 }; 
        int n = arr.length; 
          
        System.out.println(findInteger(arr, n)); 
    } 
} 