import java.io.*;
import java.util.ArrayList;
 
public class Marks {
public static void main(String[] args)
   {
 
       // create an empty array list with an initial capacity
       ArrayList<Integer> arrlist = new ArrayList<Integer>(6);
 
       // use add() method to add elements in the list
       arrlist.add(56);
       arrlist.add(65);
       arrlist.add(67);
       arrlist.add(87);
       arrlist.add(47);

       // adding element 35 at fourth position
       arrlist.add(2, 78);
 
       // let us print all the elements available in list
       for (Integer number : arrlist) {
           System.out.print(""+number+",");
       }
   }
}
