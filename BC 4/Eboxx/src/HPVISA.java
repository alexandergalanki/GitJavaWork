public class HPVISA extends VISA{

    public HPVISA() {     
//Calling default constructor from superclass
		super();
	}

	/**
	 * @param holderName
	 * @param ccv
	 */
	public HPVISA(String holderName, String ccv) {  //Calling parameterized constructor from superclass
		super(holderName, ccv);
	}
	
	public double computeRewardPoints(String purchaseType, double amount)
	{
		double points;
		if(purchaseType.equals("Fuel"))
		{
			points= VISA.computeRewardPoints(purchaseType, amount)+10;
		}
		else
			points= VISA.computeRewardPoints(purchaseType, amount);
		return points;
	      
	}

}
