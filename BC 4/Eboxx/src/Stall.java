public class Stall {

    protected String Name;
	protected String Detail;
	protected String OwnerName;
	
	public Stall() {
		super();
	}

	public Stall(String name, String detail, String ownerName) {
		super();
		this.Name = name;
		this.Detail = detail;
		this.OwnerName = ownerName;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getDetail() {
		return this.Detail;
	}

	public void setDetail(String detail) {
		this.Detail = detail;
	}

	public String getOwnerName() {
		return this.OwnerName;
	}

	public void setOwnerName(String ownerName) {
		this.OwnerName = ownerName;
	}
	
	public double computeCost(String stallType, int squareFeet)
	{
		int a;
		switch (stallType)
		{
		case "Platinum": a=200;
		                 break;
		case "Diamond": a=150;
		                 break;
		default: a=100;
		         break;
		}
		
		return a*squareFeet;
	}
	
	public double computeCost(String stallType,int squareFeet,int numberOfTV)
	{
		double a;
		switch (stallType)
		{
		case "Platinum": a=200;
		                 break;
		case "Diamond": a=150;
		                 break;
		default: a=100;
		         break;
		}
		
		return ((a*squareFeet)+(numberOfTV*10000));
	}
	
}
