

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
public class Delete extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String aId=request.getParameter("aadharid");
		  PrintWriter out=response.getWriter();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saiguru","saiguru");
				PreparedStatement ps=con.prepareStatement("DELETE FROM aadhar where aadharid=?");
				ps.setInt(1, Integer.parseInt(aId));
				
				int res=ps.executeUpdate();
				if(res>0) {
					out.println("deleted successfully");
				}else
				{
					response.sendRedirect("Delete.html");
				}con.commit();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
