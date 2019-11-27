public class Point {
   public int x;
   public int y;
   //Point()()
   Point(int xcoord, int ycoord){
       this.x = xcoord;
       this.y = ycoord;
   }
   public int getX() {
       return x;
   }
   public int getY() {
       return y;
   }    
   public static int distance(Point p1, Point p2) {
    int sx = p1.x - p2.x;
    int sy = p1.y - p2.y;
    return (int) Math.sqrt(sx * sx + sy * sy);
   }
public static void main(String str[]){

int x = 0;
int y = 0;

    Point p1 = new Point(-1,1);
    Point p2 = new Point(3,4);
    Point mp = new Point(x,y);

        x = (p1.getX() + p2.getX()) / 2;
        y = (p1.getY() + p2.getY()) / 2;
        System.out.print(""+Point.distance(p1, p2));
    }

}
