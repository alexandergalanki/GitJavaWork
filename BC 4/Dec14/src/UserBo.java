public class UserBo {
    
	public UserBo()                    //Creating a Default Constructor
	{
	}
	
	static void validate(User u) throws Exception          //Method to check exception
	{
		int numCount=0;
		String n= u.getPassword();
		for(int i=0;i<n.length();i++)                      //Numeric counter
		{
			if(n.charAt(i)>='0' && n.charAt(i)<='9')
			{
				numCount++;
			}
		}
		
		if(numCount==0)                                   //If there are no numerics in password, then throw an exception
		{
			throw new WeakPassword("Your password is weak");
		}
	}

}