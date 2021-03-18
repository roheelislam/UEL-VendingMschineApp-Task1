/*Roheel Islam
Student ID 1925979
04-02-19
*/


import java.util.*;
public class Lab5
{

	public static void main(String[] args)
	{
		
	int counter, total, i;

	Scanner keyboard = new Scanner (System.in);

	System.out.print("Enter the time table: ");
	
	counter = keyboard.nextInt();
	
		
	while (counter<2 || counter>100)
	{
		System.out.print("Invalid!!! Enter number 2-100 only: ");
		counter=keyboard.nextInt();
	}
	
	for (i= 1; i<=12; i++)
		
		{
		total = counter * i;
		System.out.println(i+ " x " + counter +" = "+ total);
		}	
	
	}

}
