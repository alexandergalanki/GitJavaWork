import java.sql.Date;

public class StudentVO {
	
private int studentId,studentMarks;
private String studentName,studentAddress,studentEmail,studentPassword;
private long mobile;
Date dob;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getStudentMarks() {
	return studentMarks;
}
public void setStudentMarks(int studentMarks) {
	this.studentMarks = studentMarks;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public String getStudentPassword() {
	return studentPassword;
}
public void setStudentPassword(String studentPassword) {
	this.studentPassword = studentPassword;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}

}
