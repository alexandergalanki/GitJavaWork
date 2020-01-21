public class Airport {
    
	private String iataAirportCode;  //initializing variables
	private String name;
	private String city;
	private int noOfFlights;
	
	public Airport() {             //Default Constructor
		super();
	}

	public Airport(String iataAirportCode, String name, String city, int noOfFlights) { //Parameterized Constructor
		super();
		this.iataAirportCode = iataAirportCode;
		this.name = name;
		this.city = city;
		this.noOfFlights = noOfFlights;
	}

	public Airport(String name, String city, int noOfFlights) {
		super();
		//this.iataAirportCode = iataAirportCode;
		this.name = name;
		this.city = city;
		this.noOfFlights = noOfFlights;
	}

	public String getIataAirportCode() {
		return this.iataAirportCode;
	}

	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNoOfFlights() {
		return this.noOfFlights;
	}

	public void setNoOfFlights(int noOfFlights) {
		this.noOfFlights = noOfFlights;
	}
	

}