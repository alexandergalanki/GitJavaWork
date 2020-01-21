public class Exhibition extends Event {
    
	private int NoOfStalls;

	public Exhibition() {
		super();
	}

	public Exhibition(String name, String details, String ownerName,int NoOfStalls) {
		super(name, details, ownerName);
		this.NoOfStalls= NoOfStalls;
	}
	
	public double projectedRevenue(int noOfStalls)
	{
		return noOfStalls*10000;
		
	}
}