public class Maxmin
{
public static void main(String args[])
{
   int array[] = new int[]{10, 4, 5, 4, 8, 10};

 
   int max = getMax(array);
   int min = getMin(array);
   System.out.println("Max = "+max+ " & " +"Min= "+min);
   }
public static int getMax(int[] inputArray)
{
   int maxValue = inputArray[0];
   for(int i=1;i < inputArray.length;i++)
   {
     if(inputArray[i] > maxValue)
     {
        maxValue = inputArray[i];
     }
   }
   return maxValue;
 }
public static int getMin(int[] inputArray)
{
   int minValue = inputArray[0];
   for(int i=1;i<inputArray.length;i++)
   {
     if(inputArray[i] < minValue)
     {
       minValue = inputArray[i];
     }
   }
   return minValue;
 }

}
