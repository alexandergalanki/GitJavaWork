package codeCamp2;
import java.util.Scanner;
public class Seven {
public static void main(String args[]) {
Scanner sc =new Scanner(System.in);	
float basicSal=0.00f;
float hra=0.0f,da=0.0f,grossSal=0.0f;
System.out.println("enter employee basic salary");
basicSal=sc.nextFloat();
if(basicSal<1500) {
	hra= 0.1f*basicSal;
	da=0.05f*basicSal;
	grossSal= hra+da+basicSal;
	System.out.println("Gross Salary:"+grossSal);
}
else if(basicSal>=1500) {
	hra= 500;
	da=0.98f*basicSal;
	grossSal= hra+da+basicSal;
	System.out.println("Gross Salary:"+grossSal);
}
}
}