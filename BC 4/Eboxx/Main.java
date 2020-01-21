
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {
public static void main(String[] args) throws NumberFormatException, ParseException {
        
    	Scanner sc= new Scanner(System.in);
		List<TicketBooking> li= new ArrayList<TicketBooking>();
		System.out.println("Enter the number of bookings:");
		int n= Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of booking "+(i+1));
			String data= sc.nextLine();
			String a[]= data.split(",");//Split the string 
			TicketBooking tb= new TicketBooking(a[0],(new SimpleDateFormat("dd-MM-yyyy").parse(a[1])),a[2],Double.parseDouble(a[3]));
			//Creating object for Ticketbooking class and adding it to arrayList
			li.add(tb);
		}
		System.out.println("Sorted Order:");
		//Sorting using price and Booking time comparator
		Collections.sort(li,new PriceAndBookingTimeComparator());
		System.out.printf("%-15s%-15s%-15s%-15s\n","Event name","Booking Time","Seat number","Price");
		for (TicketBooking ticketBooking : li) 
		{
			//Printing sorted list
			System.out.println(ticketBooking);
		}

	}
}