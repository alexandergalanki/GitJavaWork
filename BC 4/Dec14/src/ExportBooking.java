import java.util.List;

public class ExportBooking {
    
	public void exportJSON(List<TicBooking> bookings)
	{
		int i=bookings.size();
		//System.out.println(i);
		TicBooking t= new TicBooking();
		for (TicBooking ticketBooking : bookings)
		{
			System.out.print(t.JSON(ticketBooking));
			i--;
			if(i>0)
			{
				System.out.println(",");
			}
		    
		}
	}
	public void exportCSV(List<TicBooking> bookings)
	{
		TicBooking t= new TicBooking();
		for (TicBooking ticketBooking : bookings) {
			System.out.println(t.CSV(ticketBooking));
		}
		
	}
}