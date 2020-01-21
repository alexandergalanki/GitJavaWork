package hibernate;
import java.lang.reflect.Method;

public class MyAnnTestdemo{
 public static void main(String[] args)throws Expection{
	MyAnnTest mat=new MyAnnTest();
Method m=mat.getClass().getMethod("myTestMethod");

MySampleAnn msa=m.getAnnotation(MySampleAnn.class);
System.out.println("Name; "+msa.name());
System.out.println("Description: "+mas.desc());
 
	mat.myTestMethod();
}