public class CarSerAirport extends Airport {
    
	private int noOfcargoUnitsperflight;

	public CarSerAirport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CarSerAirport(String name, String city, int noOfFlights,int noOfcargoUnitsperflight) {
		super(name, city, noOfFlights);
		this.noOfcargoUnitsperflight=noOfcargoUnitsperflight;
	}
	
	public int calculatenoOfCargounits(int noOfFlights, int noOfcargoUnitsperflight)
	{
		return noOfFlights*noOfcargoUnitsperflight;
	}
	
}