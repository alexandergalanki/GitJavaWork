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

@WebServlet("/DeleteStudent")

public class DeleteStudent extends HttpServlet {

       
   
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String s1=request.getParameter("studid");
int studId=Integer.parseInt(s1);

try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
PreparedStatement ps=cname.prepareStatement("delete from student1 where stu_id=?");
ps.setInt(1,studId );

int result=ps.executeUpdate();
if(result>0)
{
cname.commit();
PrintWriter out=response.getWriter();
out.println("Deletion done "+s1);

}
else
response.sendRedirect("Studentdelete.html");
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
