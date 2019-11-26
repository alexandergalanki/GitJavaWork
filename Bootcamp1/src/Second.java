import java.util.Scanner;
public class Second{
public static void main(String[] args)

{
int num1, num2, num3, result, temp;
Scanner scanner = new Scanner(System.in);
System.out.print("");
num1 = scanner.nextInt();
System.out.print("");
num2 = scanner.nextInt();
System.out.print("");
num3 = scanner.nextInt();
scanner.close();
temp = num1 < num2 ? num2:num1;
result = num3>  temp ? num3:temp;
System.out.println("Oldest friend:"+result+" Years");
temp = num1 < num2 ? num1:num2;
result = num3 < temp ? num3:temp;
System.out.println("Youngest friend:"+result+" Years");
}
}