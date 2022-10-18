package assignments;

/**
 * @author MEENAG
 *
 */

import java.util.Scanner;

public class Palindrome 
{
	 public static void main(String args[]) 
	 {
		 Scanner s=new Scanner(System.in);
	     System.out.println("Enter the String: ");
	     String str = s.nextLine(); 
	     
	     System.out.println(isPalindrome(str));
	 }
	 
	 static boolean isPalindrome(String str) 
	 {	
	     int n = str.length(),
		 e = n - 1;
	     
	     // If string is empty or contains one character, then it is palindrome
	     if ((n == 0) || (n == 1))	
	    	 return true; 
	
	     return checkPalindrome(str, 0, e); 
	 }   
	 
	 static boolean checkPalindrome(String str, int s, int e)
	 {
	     // If first and last characters do not match
	     if ((str.charAt(s)) != (str.charAt(e))) 
	    	 return false;   

	    // If there are multiple characters 
	     if (s < e + 1) 
	    	 return checkPalindrome(str, s + 1, e - 1);   
	    return true; 
	 }   
}