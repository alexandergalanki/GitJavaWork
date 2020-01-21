
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateStudent")

public class UpdateStudent extends HttpServlet {
private static final long serialVersionUID = 1L;
       
   
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String s1=request.getParameter("studid");
int studId=Integer.parseInt(s1);
String s2=request.getParameter("mobile");
long studMobile=Long.parseLong(s2);

try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
PreparedStatement ps=cname.prepareStatement("update student1 set stu_mobile=? where stu_id=?");
ps.setInt(2,studId );

ps.setLong(1,studMobile );
int result=ps.executeUpdate();
if(result>0)
{
cname.commit();
PrintWriter out=response.getWriter();
out.println("Updation done "+s1);

}
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
