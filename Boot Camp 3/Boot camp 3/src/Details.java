import java.util.Scanner;

public class Details{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	     
		System.out.println("Enter Name:");                    
		String name= sc.next();
		System.out.println("Enter Gender:");
		String gen= sc.next();
		
		if(gen.equals("male"))                               
		{
			System.out.println("Enter age:");
			int age= sc.nextInt();
	        
			if(age<20)                                                     
			{
				System.out.println("Not Eligible ");
			}
			
			
			else if(age>=20 &&age<=30)        
			{
				System.out.println("Enter weight of the candidate(in pounds or kgs)");
				float wt= sc.nextFloat();
				
				if(wt>100)                                    //Weight conversion if it is mentioned in Pounds
				{
					wt = (float) (wt/2.2);
				}
				if(70.4545 <= wt && wt<=79.5454)
				{
					System.out.println("Enter hieght of candidate(in inches or cms)");
					float ht= sc.nextFloat();
					
					if(ht<10)                                 //Height conversion if it is mentioned in inches
					{
						ht = ht*2.54f;
					}
					if(13.207<=ht && ht<=13.969)
					{
						System.out.println("Name   : "+name);
						System.out.println("Gender : "+gen);
						System.out.println("Weight : "+wt+" (in kgs)");
						System.out.println("Hieght : "+ht+" (in cms)");
						System.out.println(name+" is eligible");
					}
					else
					{
						System.out.println("Not Eligible");
					}
				}
				else
				{
					System.out.println("Not Eligible");
				}
			}
			
			else if(age>30 && age<=40)
			{
				System.out.println("Enter weight of the candidate(in pounds or kgs)");
				float wt= sc.nextFloat();
				
				if(wt>100)                                       //Weight conversion if it is mentioned in Pounds
				{
					wt = (float) (wt/2.2);
				}
				if(77.2727 <= wt && wt<=81.8181)
				{
					System.out.println("Enter hieght of candidate(in inches or cms)");
					float ht= sc.nextFloat();
					
					if(ht<10)
					{                                             //Height conversion if it is mentioned in inches
						ht = ht*2.54f;
					}
					if(13.716<=ht && ht<=14.224)
					{
						System.out.println("Name   : "+name);
						System.out.println("Gender : "+gen);
						System.out.println("Weight : "+wt);
						System.out.println("Hieght : "+ht);
						System.out.println(name+" is eligible");
					}
					else
					{
						System.out.println("Not Eligible");
					}
				}
				else
				{
					System.out.println("Not Eligible");
				}
			}
			else if(40<age && age<=50)
			{
				System.out.println("Enter weight of the candidate(in pounds or kgs)");
				float wt= sc.nextFloat();
				
				if(wt>100)                                    //Weight conversion if it is mentioned in Pounds
				{
					wt = (float) (wt/2.2);
				}
				if(79.5454 <= wt && wt<=84.0909)
				{
					System.out.println("Enter hieght of candidate(in inches or cms)");
					float ht= sc.nextFloat();
					
					if(ht<10)
					{                                          //Height conversion if it is mentioned in inches
						ht = ht*2.54f;
					}
					if(14.224<=ht && ht<=15.24)
					{
						System.out.println("Name   : "+name);
						System.out.println("Gender : "+gen);
						System.out.println("Weight : "+wt);
						System.out.println("Hieght : "+ht);
						System.out.println(name+" is eligible");
					}
					else
					{
						System.out.println("Not Eligible");
					}
				}
				else
				{
					System.out.println("Not Eligible");
				}
			}
			else
			{
				System.out.println("Not Eligible");
			}
			}
		else                                                             
		{
			System.out.println("Only male candidates are allowed");
		}
				
		}

	}