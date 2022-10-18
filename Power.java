package assignments;

/**
 * @author MEENAG
 *
 */

import java.util.Scanner;

public class Power
{
	public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        int n =s.nextInt(); 
        System.out.println("Enter the Exponent: ");
        int x =s.nextInt();
        
        System.out.println("The value of " + n + " power " + x + " is " + power(n, x));
    }
	
	static int power(int n, int x)
	{
		int output = 1;
		
		if (x == 0)
			return 1;
		
		while (x > 0) 
        {
            if (x % 2 != 0)		
            {
                output = output * n;
            }
            n = n * n;
            x = x >> 1; 
        }
        return output;
	}
}

