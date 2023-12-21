package Day_10;
import java.util.Scanner;

public class Search_number 
{
		
	public static int binarySearch(int[] arr, int target) 
	{
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) 
            {
                return mid; 
            }

            if (arr[mid] < target) 
            {
                left = mid + 1; 
            } else 
            {
                right = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) 
    {
        
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);

        if (result != -1) 
        {
            System.out.println("Found at index " + result);
        } else 
        {
            System.out.println(" Not found in the array.");
        }
    } 


}
