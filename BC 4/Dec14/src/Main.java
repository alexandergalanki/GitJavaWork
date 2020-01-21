import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
public static void main(String[] args) throws NumberFormatException, ParseException {
	
	 Scanner sc= new Scanner(System.in);
	 ArrayList<TicBooking> li= new ArrayList<TicBooking>();
	 System.out.println("Enter the number of bookings:");
	 int n= Integer.parseInt(sc.nextLine());
	 System.out.println("Enter the booking details:");
	 for(int i=0;i<n;i++)
	 {
		 String event= sc.nextLine();
		 String ev[]= event.split("-");
		 TicBooking t= new TicBooking(ev[0],Double.parseDouble(ev[1]),new SimpleDateFormat("dd/mm/yyyy").parse(ev[2]),ev[3]);
		 li.add(t);
	 }
	 System.out.println("Enter a type:\r\n1.JSON\r\n2.CSV");
	 int sel= Integer.parseInt(sc.nextLine());
	 ExportBooking eb= new ExportBooking();
	 if(sel==1)
	 {
		 System.out.println("[");
		 eb.exportJSON(li);
		 System.out.print("\r\n]");
	 }
	 else if(sel==2)
	 {
		 System.out.println("customer,price,bookingTime,stageEventShow");
		 eb.exportCSV(li);
	 }
	 else
	 {
		 System.out.println("Invalid Input");
}
}
}
