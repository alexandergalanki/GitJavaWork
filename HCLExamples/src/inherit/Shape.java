package inherit;

public interface Shape {
	
	public String shapeName;
	public int vertex;

	
	public abstract void calcArea();
}
class Circle extends Shape
	{
		float radius,area;
		Circle()
		{
			final static float PI=3.141f;
			
		}
	public void calcArea()
	{
		area=PI*radius*radius;
		System.out.println("Area of a circles is:"+area);
	}

}
class Triangle extends Shape
float base height area;

{
}