package inherit;

public class Human extends Species{
public static int legs=2;
private boolean swimmingStatus;
//Human constructor
Human()	
{
	 swimmingStatus=false;
}
//static method 
	
	public static void talk()
	{
		System.out.println("can talk");
	}
	//non static
 public void walk()
 {
	 System.out.println("can walk"  +legs+  " legs ");
	 
 }
}
