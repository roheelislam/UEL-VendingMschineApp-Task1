/*Roheel Islam
Student ID 1925979
Date 24-02-19*/

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class VendingMachineApp 
{
	public static void main(String[] args) 
	{

		NumberFormat formatter = new DecimalFormat("#0.00");	// Used to format pounds and pence
		int userInput = 0;
		int numberOfGums = 0;
		int numberOfChocolates = 0;
		int numberOfPopcorn = 0;
		double gum = 1.50;
		double chocolate = 3.00;
		double popcorn = 2.50;

		do 
		{
			System.out.println("Select from the following options:");
			System.out.println("[1] For Gum = £" + formatter.format(gum) + "p");
			System.out.println("[2] For chocolate = £" + formatter.format(chocolate));
			System.out.println("[3] For popcorn = £" + formatter.format(popcorn) + "p");
			System.out.println("[4] For number of each type of item sold, Total sale & Total money taken.");
			System.out.println("[5] To Quit. \n");

			System.out.print("Enter options from 1-5 only = ");
			Scanner sc = new Scanner(System.in);
			userInput = sc.nextInt();

			//Variable declared which stores the number and amount of products bought
			double totalGum = numberOfGums * gum;
			double totalChocolate = numberOfChocolates * chocolate;
			double totalPopcorn = numberOfPopcorn * popcorn;
			double total = totalGum + totalChocolate + totalPopcorn;
			int totalItems = numberOfGums + numberOfChocolates + numberOfPopcorn;

			switch (userInput) //switch used to trigger according to userInput
			{
			case 1:	
				System.out.println("Here is your gum \n"); 
				numberOfGums++;
				break;

			case 2:
				System.out.println("Here is your Chocolate \n"); 
				numberOfChocolates++;
				break;

			case 3:
				System.out.println("Here is your popcorn \n"); 
				numberOfPopcorn++;
				break;

			case 4: 
				System.out.println(numberOfGums + " item/s of gum sold = £" + formatter.format(totalGum));  //formatted so 0.00 pence shows
				System.out.println(numberOfChocolates + " item/s of chocolate sold = £" + formatter.format(totalChocolate));
				System.out.println(numberOfPopcorn + " item/s of popcorn sold = £" + formatter.format(totalPopcorn));
				System.out.println("\n*** TOTAL PRODUCTS SOLD = " + totalItems + " items ***"); //total products sold
				System.out.println("*** TOTAL MONEY TAKEN = £" + formatter.format(total) + " ***\n"); //total money taken 
				
				break;

			case 5:
				System.out.println("You have chosen to quit the program. Good-bye and have a lovely day!!!");
				break;

			default:
				System.out.println("Error, options 1-5 only!\n"); //default statement if userInput is not from 1-5
			}
		} 
		while (userInput != 5); //Continuous loop used to terminate program
		
	}
}