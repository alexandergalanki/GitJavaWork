// exception handling demo
class Myexception extends Exception
{
	// constructor
Myexception()
{
System.out.println("Exception created");
}
public Myexception handler()
{
System.out.println("Exception handled here");
return this;
}
public static void main(String args[]) throws Myexception
{
int a,b;
Integer result;

if(args.length!=2)
{
System.out.println("pls pass two numbers as arguments!");

}
else
{
try {
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
result=a+b;
System.out.println(result);
}
//catch(NumberFormatException ne)
//{
//System.out.println("please pass numbers only as argumrnts");
//}
//
//
//catch(ArithmeticException ae)
//{
//System.out.println("please pass non ZERO value as 2nd argument");
//}
catch(Exception e)
{
  //e.printStackTrace();
  //System.out.println("Exception occured");
throw new Myexception().handler();
}
finally
{
result=null;
System.out.println("Finally Blocked  is Ocuured");
}
}
}
}
