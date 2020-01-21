

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Insert extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String n=request.getParameter("uname");  
	        String pass=request.getParameter("pwd");  
	        String aaId=request.getParameter("aadharid");  
	        String city=request.getParameter("city");
	        String state=request.getParameter("state");  
	        String occpType=request.getParameter("occ");  
	        String dept=request.getParameter("depts");  
	        String sal=request.getParameter("sal");
	        String pincode=request.getParameter("pincode");
	          PrintWriter out=response.getWriter();
	          try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement ps=con.prepareStatement("INSERT INTO aadharinfo values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,n);
			ps.setInt(2, Integer.parseInt(aaId));
			ps.setString(3, city);
			ps.setString(4, state);
			ps.setInt(5, Integer.parseInt(pincode));
			ps.setInt(6, Integer.parseInt(dept));
			ps.setInt(7, Integer.parseInt(sal));
			ps.setString(8, pass);
			ps.setString(9, occpType);

			int res=ps.executeUpdate();
			if(res>0) {
				out.println("Registered successfully");
			}else
			{
				out.println("check the details properly");
			}
	          } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
	}

}
