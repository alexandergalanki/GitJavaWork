public class ComSerAirport extends Airport {
    
	private int NoOfPassengersPerFlight;

	public ComSerAirport() {      //Default Constructor
		super();
	}

	public ComSerAirport(String name, String city, int noOfFlights, int noOfpassengersperflight) {
		super(name, city, noOfFlights);
		this.NoOfPassengersPerFlight=noOfpassengersperflight;
	}                                          //Parameterized Constructor

	public int getNoOfpassengersperflight() {
		return NoOfPassengersPerFlight;
	}

	public void setNoOfpassengersperflight(int noOfpassengersperflight) {
		this.NoOfPassengersPerFlight = noOfpassengersperflight;
	}
	
	public int calculatenoOfPassengers(int noOfFlights, int noOfpassengersperflight)  // Method to calculate no of passengers
	{
		return noOfFlights*noOfpassengersperflight;
	}	

}