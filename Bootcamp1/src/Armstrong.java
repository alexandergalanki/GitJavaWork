import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Input number is: ");
    	
        int number =sc.nextInt(), originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println("Given number is an Armstrong");
       
}
}
