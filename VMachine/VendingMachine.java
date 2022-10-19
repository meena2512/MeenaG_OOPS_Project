package assignments.VM;

import java.util.Scanner;

public class VendingMachine 
{
	public static void main(String[] args)
    {
		execute();
	}
		
		
	public static void execute() 
	{
		int price, total = 0;
		String num, name;
		Boolean cont = true;
		Scanner s = new Scanner(System.in);
	
		System.out.println("Hello, Welcome!! \n\nPlease select an Item Number: ");
		
		for (Items i : Items.values())  
		{
			num = i.getNum();
			name = i.getName();
			price = i.getPrice();
			System.out.println(num + " " + name + " - Rs." + price);  
		}
				
		while(cont == true)
	    {
			int itno = 0;
			itno = s.nextInt();	
			switch(itno)
			{
			case 1:
				total += Items.PZ.getPrice();
				break;
			case 2:
				total += Items.BG.getPrice();
				break;
			case 3:
				total += Items.SW.getPrice();
				break;
			case 4:
				total += Items.CK.getPrice();
				break;
			case 5:
				total += Items.WT.getPrice();
				break;
			}
			
			System.out.println("The price of your cart items is Rs." + total + 
					"\nWould you like to continue selecting other items?? \n 1.Yes 2.No");	
			int con =s.nextInt();
			switch(con)
			{
			case 1:
				cont = true;
				System.out.println("Great! Please enter the next Item Number");
				break;
			case 2: 
				cont = false;
				System.out.print("Got it!");
				break;
			}			
	    }
		
		System.out.println("Please select the payment type: \n 1. Cash 2. Card");
		int pay =s.nextInt();
		switch(pay)
		{
		case 1:
			System.out.println("Kindly pay Rs." + total + "\nThanks, Please Enjoy the food!");
			break;
		case 2: 
			total = 2 * total;
			System.out.println("Kindly pay Rs." + total + "\nThanks, Please Enjoy the food!");
			break;
		}				
	}
}


