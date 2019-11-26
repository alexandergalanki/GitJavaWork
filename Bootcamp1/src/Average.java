import java.util.Scanner;
public class Average {
public static void main(String[] args)
{
int n,num,sum=0, i;
Scanner input =new Scanner(System.in);
for(i=1;i<=5; i++)
{
num=input.nextInt();
sum += num;
}
int average=(int)sum/5;
System.out.println(average);
}
}

