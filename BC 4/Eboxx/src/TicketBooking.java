public class TicketBooking {
    
	private String stage_Event;
	private String customer;
	private int noOfSeats;
	
	public TicketBooking() {
		super();
	}

	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stage_Event = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}

	public String getStageEvent() {
		return this.stage_Event;
	}

	public void setStageEvent(String stageEvent) {
		this.stage_Event = stageEvent;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getNoOfSeats() {
		return this.noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
	public void makePayment(double amount)
	{
		System.out.println("Amount "+amount+" paid in cash");
	}
	
	public void makePayment(String walletNumber ,double amount)
	{
		System.out.println("Amount "+amount+" paid using wallet number "+walletNumber);
	}
	
	public void makePayment(String creditCard,String ccv,String name,double amount)
	{
		System.out.println("Amount "+amount+" paid using "+creditCard+" card\r\n" + 
				"CCV:"+ccv);
	}
	

}