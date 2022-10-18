package assignments;

/**
 * @author MEENAG
 *
 */

import java.util.Scanner;

public class FindIndices
{
  public static void main(String[] args) 
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the number of elements: ");
	  int n=s.nextInt(); 
	  int[] arr = new int[n];
	  
	  System.out.println("Enter "+ arr.length + " integer values: ");
	  for(int i=0; i < arr.length; i++) 
	  {
		  arr[i] = s.nextInt();
	  }
	  System.out.println("Enter the target number: ");
	  int targetNo=s.nextInt(); 
	  
	  int[] result = Sum(arr, targetNo);
	  System.out.println("The required indices are " + result[0] + ", " + result[1]);
  }
  
  public static int[] Sum(int[] arr, int target) 
  {
      for(int i = 0; i < arr.length; i++) 
      {
          for(int j = i + 1; j < arr.length; j++) 
          {
              if(arr[i] + arr[j] == target)
                  return new int[]{i, j};
          }
      }
      return new int[]{-1,-1};
  }
}
