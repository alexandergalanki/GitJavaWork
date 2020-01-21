package codeCamp2;

import java.util.Scanner;

public class Four {
public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input a string: ");
      String str = sc.nextLine();
      System.out.print("The middle character in the string: " + middle(str)+"\n");
  }
public static String middle(String name)
  {
      int position;
      int length;
      if (name.length() % 2 == 0)
      {
          position = name.length() / 2 - 1;
          length = 2;
      }
      else
      {
          position = name.length() / 2;
          length = 1;
      }
      return name.substring(position, position + length);
  }
}

