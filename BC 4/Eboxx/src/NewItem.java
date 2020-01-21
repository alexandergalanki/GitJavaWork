public class NewItem {

    private String name;
	private String type;
	private int cost;
	private int availableQuantity;
	
	public NewItem() {
		super();
	}

	public NewItem(String name, String type, int cost, int availableQuantity) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		//if(availableQuantity>0)
		this.availableQuantity = availableQuantity;
	
}
	@Override
	public String toString() {
		return name+","+type+","+cost+",";
	}
	
	
	
	
}