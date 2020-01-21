package codecamp1;

public class Shapedemo {
	public static void main(String args[])
	{
		Squ sqt=new Squ(4);
		

		sqt.getPerimeter();
		sqt.getArea();
		
		
Pentagon pt=new Pentagon(5);
pt.getPerimeter();
pt.getArea();

Circle cr=new Circle(5);
cr.getPerimeter();
cr.getArea();

	}
}
