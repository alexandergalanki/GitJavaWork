package codecamp1;

public class Student {
	
	
	private String FirstName;
	private String LastName;
	private char Grade;
	
	Student(String FirstName, String LastName,char Grade)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Grade=Grade;
		
		
	}
	
	void display()
	{
		System.out.println("The FirstName is        :  "+FirstName);
		System.out.println("The Student LastName is :  "+LastName);
		System.out.println("This is the Grade of the student : "+Grade);
	}

}
