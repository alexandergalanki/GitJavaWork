public class Addingdemo
{

	public static void main(String args[])
	{
		int a,b,result;
		try {
		if(args.length!=2)
		{
			System.out.println("pls pass two numbers as arguments!");
			
		}else
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			result=a/b;
		}
		}
			
			catch(NumberFormatException ne)
			{
				System.out.println("please pass numbers only as argumrnts");
			}catch(ArithmeticException ae)
			{
				System.out.println("please pass non ZERO value as 2nd argument");
			}	
			catch(Exception Addingdemo)
			{
				//e.printStackTrace();
				System.out.println("Exception occured");
			}
		}
	}

			
	
	
