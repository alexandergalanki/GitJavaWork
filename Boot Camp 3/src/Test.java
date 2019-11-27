public class Test {
public static int m1(int x)
{
return ++x;
}
public static void main (String[] args)
{
int x = 1;
int y = m1(x);
System.out.println("x=" + x + ", y=" + y);
}
}

