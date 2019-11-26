import java.util.Scanner;

public class Alphabet {
public static void main(String[ ] arg)
  {
boolean isVowel=false;;
Scanner scanner=new Scanner(System.in);
System.out.print("Input an alphabet : ");
char ch=scanner.next().charAt(0);
scanner.close();
switch(ch)
{
  case 'a' :
  case 'e' :
  case 'i' :
  case 'o' :
  case 'u' :
  case 'A' :
  case 'E' :
  case 'I' :
  case 'O' :
  case 'U' : isVowel = true;
}
if(isVowel == true) {
  System.out.println("Input character is vowel");
}
else {
  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println("Input Character is Consonant");
  else
System.out.println("Invalid data");
       }
  }
}
