package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Logindemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Loginframe If=new Loginframe();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Alex","bobby");
		
		Statement s=con.createStatement();
		Result rs=(Result) s.executeQuery("Select*from Product");
	}
}
