import java.util.Scanner;

public class Sort {
void sort(int arr[])
    {
        int n = arr.length;

 
        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
   
 
    // Driver code to test above
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Sort ob = new Sort();
int k = 6;
int arr[] = new int[k];
        System.out.println("Input the array elements:");
        for(int i = 0; i < k; i++)
        {
            arr[i] = sc.nextInt();
        //{4,8,1,3,45,12};
       
    }
       ob.sort(arr);
       
        System.out.println("Array elements after sorting:");
        ob.printArray(arr);
}
}