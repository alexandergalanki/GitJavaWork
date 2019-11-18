package MyIo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class Student implements Serializable
{
	private int rollNum;
	private String StudentName;
	private float marks;
	//private transient
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void setMarks(String string) {
		// TODO Auto-generated method stub
		
	}
}
class Markscomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		;
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		float m1=s1.getMarks();
		float m2=s2.getMarks();
		if(m1>m2)
			return 1;
		else 
			return 0;
	}
	
}
public class Persistdemo {
	
	public static void main(String[] args) throws IOException {
		Student s1=new Student();
		s1.setRollNum(9999);
		s1.setStudentName("Bobby");
		s1.setMarks("500");
		
		Student s2=new Student();
		s2.setRollNum(1526);
		s2.setStudentName("chai");
		s2.setMarks("520");
		
		//serialization
		File f=new File("Student.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//write object to Hard drive or External storage media
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		//close stream objects 
		oos.close();
		fos.close();
		
		
		
		ArrayList<Student> slist=new ArrayList<Student>();
		
		slist.add(s1);
		slist.add(s2);
		
		Collections.sort(slist,new Markscomparator());
		System.out.println("Student list sorted on marks:");
		
		for(Student s:slist)
			
			System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}

}
