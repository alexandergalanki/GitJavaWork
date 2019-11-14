package oop;

public class Bird {
	//instance variables needed to store object data
	public static int legs;
	public static int wings;
	public String birdname;
	public String birdcolor;
	private boolean singStatus;
	//constructor is a method used to initialize common values to the attributes or properties
	Bird()
	{
		legs=2;
		wings=2;
		
	}
	
//setter method to set value for private variable
	public void setsingingStatus()
	{
		if(this.birdname.equalsIgnoreCase("Kokkila"))
		{
			singStatus=true;
		}
	}
	//methods to describe
	public void walk()
	{
		System.out.println(birdcolor+" "+birdname+" is walking with   "+ legs+" legs");
	}
	public void fly()
	{
		System.out.println(birdcolor+" "+birdname+" is flying with  "+ wings+" wings");;
	}
	public void sing() 
	{
		if(singStatus)
		{
			System.out.println("la ra loo... la ra looo...");
		}
		else
		{
			System.out.println(" can't sing!!!!");
		}
		
	}
	

}
