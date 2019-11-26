import java.util.Scanner;

public class Scholar{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english , chemistry, computers, physics, maths; 
	    
		sc = new Scanner(System.in);
		
		
//		english = sc.nextInt();	
//		chemistry = sc.nextInt();	
//		computers = sc.nextInt();	
//		physics = sc.nextInt();	
//		maths = sc.nextInt();	
//		
		Scholar( english,  chemistry,  computers,  physics,  maths);	
	}	
	private static void Scholar(int english, int chemistry, int computers, int physics, int maths) {
		// TODO Auto-generated method stub
		
	}
	public static void studentGrade(int eng, int chem, int com, int phy, int math)
	{
		float total, Percentage;
		
		total = eng + chem + com + phy + math;
	    Percentage = (total / 500) * 100;
	 
	    
		
		if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Grade F");
		} 
	}
}