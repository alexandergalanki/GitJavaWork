import java.util.List;

interface Export {
    public String exportJSON(List<TicBooking> bookings);
	public String exportCSV(List<TicBooking> bookings);
}


