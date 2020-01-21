
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentLocation")

public class StudentLocation extends HttpServlet {

       
   
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String address=request.getParameter("stud_address");

try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
PreparedStatement ps=cname.prepareStatement("select * from student1 where stu_address=?");
ps.setString(1,address );

ResultSet rs=ps.executeQuery();
StudentVO sv=new StudentVO();
List<StudentVO> l=new ArrayList<StudentVO>();
while(rs.next())
{
PrintWriter out=response.getWriter();
sv.setStudentId(rs.getInt(2));
sv.setMobile(rs.getLong(5));
sv.setDob(rs.getDate(7));
sv.setStudentAddress(rs.getString(4));
sv.setStudentEmail(rs.getString(6));
sv.setStudentMarks(rs.getInt(3));
sv.setStudentName(rs.getString(1));
l.add(sv);
out.println(rs.getInt(2) + " "+rs.getString(1));

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
