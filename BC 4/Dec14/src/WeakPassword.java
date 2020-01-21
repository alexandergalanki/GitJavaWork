

public class WeakPassword extends Exception {
    
	String message;             //Message variable declaration

	public WeakPassword(String message) {            //Constructor for message variable
		super();
		this.message = message;
	}	

}