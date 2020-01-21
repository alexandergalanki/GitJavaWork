public class User {

    private String name;                            //Initializing variables
	private String mobile;
	private String username;
	private String password;
	
	public User() {                         //Default Constructor
		super();
	}

	public User(String name, String mobile, String username, String password) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.username = username;            //Parameterized Constructor
		this.password = password;
	}

	public String getName() {                         //Creating getters and Setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {                                         //To string to display data
		
		return "Name:"+this.name+"\r\nMobile:"+this.mobile+"\r\nUsername:"+this.username+"\r\nPassword:"+this.password;
	}
	
	
	
	
	
	
}