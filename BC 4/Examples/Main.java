import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception, IOException {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader brr= new BufferedReader(input);
     
		List<List<Integer>> li= new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		char ch=0;
		System.out.println("Enter the count of booked tickets:");
		for(int i=0;i<5;i++)
		{
			System.out.println("On Day "+(i+1));
			String s= brr.readLine();
			String a[]=s.split(",");
			for(int j=0;j<a.length;j++)
			{
				list.add(100-Integer.parseInt(a[j]));
			}
			li.add(list);
		}
    
    
		do
		{
			System.out.println("Enter the day to know its remaining ticket count:");
			int n=Integer.parseInt(brr.readLine());
			System.out.print("Remaining tickets:[");
			System.out.print(list.get(4*n-4)+", "+list.get(4*n-3)+", "+list.get(4*n-2)+", "+list.get(4*n-1)+"]\n");
			System.out.println("Do you want to continue?(y/n)");
			ch=brr.readLine().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}