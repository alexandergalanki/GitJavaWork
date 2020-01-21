import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentIdPassword")

public class StudentIdPassword extends HttpServlet { 
   
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {String s1=request.getParameter("studid");
int studId=Integer.parseInt(s1);
String password=request.getParameter("password");

try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
PreparedStatement ps=cname.prepareStatement("select * from student1 where stu_id=? and password=?");
ps.setInt(1,studId );
ps.setString(2, password);

ResultSet re=ps.executeQuery();
if(re.next())
{
cname.commit();
PrintWriter out=response.getWriter();
out.println(re.getInt(2) + " "+re.getString(1));

}
else
response.sendRedirect("StudentIdPassword.html");
}
catch(ClassNotFoundException c)
{
System.out.println(c);
}
catch(SQLException s)
{
System.out.println(s);
}
}

}
