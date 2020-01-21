

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class View extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aId=request.getParameter("aadharid");
		  PrintWriter out=response.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement ps=con.prepareStatement("Select * FROM aadhar where aadharid=?");
			ps.setInt(1, Integer.parseInt(aId));
			ResultSet rs=ps.executeQuery();
		   Aadharcard st=new Aadharcard();
		    if(rs.next()){
		     st.setName(rs.getString(1));
		     st.setAaid(rs.getInt(2));
		     st.setCity(rs.getString(3));
		     st.setState(rs.getString(4));
		     st.setPincode(rs.getInt(5));
		     st.setDept(rs.getInt(6));
		     st.setM_sal(rs.getInt(7));
		     st.setAaid(rs.getString(8));
		     st.setOccType(rs.getString(9));
		     request.setAttribute("skey", st);
		     RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		     rd.forward(request,response);
		    }else {
		     response.sendRedirect("View.html");
		    }
		 
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}

		
	}

}
