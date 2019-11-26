import java.util.Arrays;
import java.util.HashSet;
 
public class Intersection 
{
  public static void main(String[] args) 
  {
    Integer[] a = {0,1,2,3,4,5,6,7,8,9};
    Integer[] b = {1,3,5,7,9};
     
    HashSet<Integer> set = new HashSet<>(); 
     
    set.addAll(Arrays.asList(a));
     
    set.retainAll(Arrays.asList(b));
     
    System.out.println(set );
     
    //convert to array
    Integer [] intersection = {};
    intersection = set.toArray(intersection);
     
    System.out.println(Arrays.toString(intersection));
  }
}