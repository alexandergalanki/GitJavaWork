class OverloadDemo {

void area(double b,double h)
{

System.out.println("Using overloaded method:");
double t=0.5*b*h;
System.out.println("Area of the Triangle : "+t);

}

void area(float a, float b)
{
float r=a*b;

System.out.println("Area of the Rectangle : "+r);
}

void area(double p)
{
double s=Math.pow(p, 2);
System.out.println("Area of the Square : "+s);
}

}
 public class Overload
 {
public static void main(String args[])
{
OverloadDemo od=new OverloadDemo();
od.area(9.42,5);
od.area(9.0f,2.4f);
od.area(5.88);

}
 }
