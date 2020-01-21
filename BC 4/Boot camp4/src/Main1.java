import java.util.Scanner;
abstract class Shape1{
    abstract void numberofsides();
    protected double area;  
    public double getArea() {
        return area;
    }
    protected abstract void onAreaChange();
}
class Triangle1 extends Shape1 {
void numberofsides() {
System.out.println("Number of sides of Triangle is : 3");
}
@Override
protected void onAreaChange() {
}
}
class Trepizoid1 extends Shape1 {
   

@Override
protected void onAreaChange() {
}
void numberofsides() {
System.out.println("Number of sides of Trapeziod is : 4");
}
}
class Hexgon1 extends Shape1 {
protected void onAreaChange() {
}
@Override
void numberofsides() {
System.out.println("Number of sides of Hexagon is : 6");
}
 }
public class Main1 {
   public static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
    Shape1 s;
    double base;
   double height;
   double side1, side2, height1;
        {
           System.out.println("Enter the number which you want to compute the area");
           System.out.print("(1) Triangle (2) Trepizoid (3) Hexgon ? ");
           switch (scan.nextInt()) {
           case 1:
            s=new Triangle1();
               s.numberofsides();
               Triangle1 triangle = new Triangle1();
               System.out.print("Base: ");
               base=scan.nextDouble();
               System.out.print("Height: ");
               height=scan.nextDouble();                
               double area = 0.5 *base * height;                
               System.out.println("Area of triangle: " +area);
               break;
           case 2:
            s=new Trepizoid1();
               s.numberofsides();
            Trepizoid1 trepizoid=new Trepizoid1();
            System.out.println("Enter Length of Two Parallel Sides of Trapezium");
            side1=scan.nextDouble();
            side2=scan.nextDouble();
               System.out.println("Enter Height of Trapezium");
               height1=scan.nextDouble();
               area = 1.0 / 2 * (side1 + side2) * height1;
               System.out.println("Area of trepizoid " + area);
               break;
           case 3:
            s=new Hexgon1();
               s.numberofsides();
            Hexgon1 hexgon=new Hexgon1();
            System.out.println("Enter the side of a hexagon");
            double side=scan.nextDouble();
            area = (( 3 * Math.pow(3, 1/3) * Math.pow(side, 2))) / 2;
               System.out.println("Area of hexhon " + area);
               break;
           }
      }
 }
}
