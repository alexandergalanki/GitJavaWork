public class Stage extends Event {
    
	private int noOfShows;
	private int noOfSeatsPerShow;
	
	public Stage() {
		super();
	}

	public Stage(String name, String details, String ownerName,int noOfShows,int noOfSeatsPerShow) {
		//super(name, details, ownerName);
		this.noOfShows= noOfShows;
		this.noOfSeatsPerShow= noOfSeatsPerShow;
	}
	
	public double projectedRevenue(int noOfShows,int noOfSeatsPerShows)
	{
		return 50*noOfShows*noOfSeatsPerShows;
		
	}
	

}