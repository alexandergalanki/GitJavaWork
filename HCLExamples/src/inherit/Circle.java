package inherit;

public class Circle extends Shape
{
float radius,area;
final static float pi=3.141f;
 //Defalut Constructor
Circle()
{
System.out.println("Circle object Cons");
}
//Overload COnstructor
Circle(float radius)
{
this.radius=radius;

}
public void calcArea()
{
area=pi*radius*radius;
System.out.println("Area of circle is :"+area);

}
}















