import java.util.Scanner;

class Details
{
public static void main(String args[])  
   {
       String name, gender;
       int age;
       Scanner SC=new Scanner(System.in);
       name= SC.next();
       age=SC.nextInt();
       gender=SC.next();
       System.out.println("Name:"+name+", Age:"+age+" and "+"Gender:"+gender);
                                 
   }
}
