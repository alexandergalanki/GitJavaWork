
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
public class Update extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String aId=request.getParameter("aadharid");
	        String salary=request.getParameter("sal");
	        PrintWriter out=response.getWriter();
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				PreparedStatement ps=con.prepareStatement("UPDATE aadhar SET m_salary=? where aadharid=?");
				ps.setInt(2, Integer.parseInt(aId));
				ps.setInt(1, Integer.parseInt(salary));
				int res=ps.executeUpdate();
				if(res>0) {
					out.println("Updated successfully");
				}else
				{
					response.sendRedirect("Update1.html");
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
