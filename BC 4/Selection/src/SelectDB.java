import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SelectDB extends HttpServlet
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
          Statement stmt=null;
          ResultSet rs=null;
          Connection con= null;
     
          // Set response content type
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          String title = "Database Result";
          String docType ="<!doctype html" + "transitional//en\">\n";
          out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body>");
          try{
        	  Class.forName("oracle.jdbc.driver.OracleDriver");
        	  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Alex","bobby");
        	  stmt = con.createStatement();
        	  rs = stmt.executeQuery("Select * from Employees");
        	  out.println("<table border=1 >");
        	  out.println("<caption><h2>Employee Record</h2></caption>");

        	  out.println("<tr style='background-color:#ffffb3; color:red'>");
        	  out.println("<th>Emp Id</th>");
        	  out.println("<th> Age(Year)</th>");
        	  out.println("<th>First Name</th>");
        	  out.println("<th>Last Name</th>");
        	  out.println("</tr>");
        	  while(rs.next())
        	  {
        		  int id  = rs.getInt("Id");
        		  int age = rs.getInt("Age");
        		  String first = rs.getString("First_Name");
        		  String last = rs.getString("Last_Name");


        		  out.println("<tr style='background-color:#b3ffd9;'>");
        		  out.println("<td>" + id + "</td>");
        		  out.println("<td>" + age + "</td>");
        		  out.println("<td>" + first + "</td>");
        		  out.println("<td>" + last + "</td>");
        		  out.println("</tr>");

        	  }
        	  	out.println("</table>");
        	  	out.println("</body></html>");

        	  	// Clean-up environment
        	  	rs.close();
        	  	stmt.close();
        	  	con.close();
          }
          catch(SQLException se)
          {
        	  se.printStackTrace();
          }
          catch(Exception e)
          {
        	  e.printStackTrace();
          }
          finally
          {
        	  //finally block used to close resources
        	  try
        	  {
        		  if(stmt!=null)
        			  stmt.close();
        	  }
        	  catch(SQLException se2)
        	  {}// nothing we can do
        	  try
        	  {
        		  if(con!=null)
        			  con.close();
        	  }
        	  catch(SQLException se)
        	  {
        		  se.printStackTrace();
        	  }
          }
     }
}

