
import java.text.SimpleDateFormat;
import java.util.Date;

public class TicketBooking {

    private String stageEventShow;//declaring variables
    private Date bookingTime;
    private String seatNumber;
	private double price;
	
	public TicketBooking() {//Default constructor
		super();
	}

	public TicketBooking(String stageEventShow, Date bookingTime, String seatNumber, double price) {//Parameterized constructor
		super();
		this.stageEventShow = stageEventShow;
		this.bookingTime = bookingTime;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	public String getStageEventShow() {//Getter and setters for variables in class
		return stageEventShow;
	}

	public void setStageEventShow(String stageEventShow) {
		this.stageEventShow = stageEventShow;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()//toString method to print data
	{
		String st= new SimpleDateFormat("dd-MM-yyyy").format(bookingTime);
		System.out.printf("%-15s%-15s%-15s%-15s",stageEventShow,st,seatNumber,price);
		return "";
	}
	
	
}