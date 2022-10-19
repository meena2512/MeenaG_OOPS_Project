import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author MEENAG
 *
 */

public class LargestNumber 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = s.nextInt(); 
		
		System.out.println("Enter " + n + " Integers: ");
		for(int i = 0; i < n; i++) 
		{
			int inputNo = s.nextInt();
			arr.add(inputNo);
		}
		System.out.print("The largest number found is: ");
		printLargest(arr);	  
	}
	
	static void printLargest(ArrayList<Integer> arr)
	  {
		Collections.sort(arr, new Comparator<Integer>()
		{
			@Override
			public int compare(Integer x, Integer y)
			{
				int xy = x;
				int yx = y;
				int countx = 0, 	
					county = 0;
				
				while (x > 0) 
				{
					countx++;
					x /= 10;
				}
				
				while (y > 0) 
				{
					county++;
					y /= 10;
				}
				
				x = xy;
				y = yx;
	 
				while (countx > 0)
				{
					countx--;
					yx *= 10;
				}
	 
				while (county > 0)
				{
					county--;
					xy *= 10;
				}
				
				yx += x;
				xy += y;
				
				return -xy + yx;
	      }
	    });
	 
	    for (int i = 0; i < arr.size(); i++)
	    	System.out.print(arr.get(i));
	  }
}