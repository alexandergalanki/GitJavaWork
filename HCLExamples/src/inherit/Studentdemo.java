package inherit;

public class Studentdemo {
	public static void main(String[] args) {
		Student s1=new Student(123,new StringBuilder("Bobby"));
		s1.rollNum=123;
		s1.studentName.append("Bobby");
		s1.breath();
		s1.talk();
		s1.walk();
	}

}
