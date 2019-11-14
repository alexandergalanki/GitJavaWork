package Myarrays;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Multidimarraydemo
{

	private static final String SubjectName = null;
	private static final String StudentName = null;
	public static void display(int m[][][])
	throws Exception
	{
		String StudentName[][]= {{"bobby","sai"}};
		String SubjectName[][]= {{"Maths","Phy","Che"},{"Maths","Phy","Che"}};
		int marks[][][]=new int[2][2][5];
		int year=1;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter"+(i+1));
			for(int j=0;j<StudentName.length;j++)
			{
				System.out.println("Enter"+StudentName[i]+"Marks");
				Object subjectName;
				for(int k=0;k<SubjectName.length;k++)
				{
					System.out.println("marks for"+SubjectName[k]);
					int k1 = 0;
					marks[i][j][k1]=Integer.parseInt(br.readLine());
				}
			
					
					public static void display(int m[][][],String sName[],String subName[])
			{

		for(int i=0;i<2;i++)
		{
			System.out.println("Enter"+(i+1));
			for(int j=0;j<StudentName.length();j++){
				System.out.println("Enter"+sName[i]+"Marks");
				Object subjectName;
				for(int k=0;k<SubjectName.length();k++)
					System.out.println("marks for"+subName[k]);
					int k = 0;
					BufferedReader br;
					int[][][] marks;
					marks[i][j][k]=Integer.parseInt(br.readLine());
}
}
}
			}
			
	


