package inherit;

public class Employeedemo {
public static void main(String args[])
{
Employee emp1=new Employee();
emp1.setCompanyName("HCL");
emp1.setEmployeeId(111);
emp1.setEmployeeName(new StringBuilder("Bobby"));
emp1.setEmployeeStatus(true);
emp1.setEmployeeSalary(50000.00f);



Employee emp2=new Employee();
emp2.setCompanyName("HCL");
emp2.setEmployeeId(111);
emp2.setEmployeeName(new StringBuilder("Bobby"));
emp2.setEmployeeStatus(true);
emp2.setEmployeeSalary(50000.00f);

if(emp1.compareTo(emp2)==0)
{
System.out.println("Both objects employee ids are same");
}
else
{
System.out.println("Both objects employee ids are Not same");
}

}
}
