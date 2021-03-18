import java.util.Scanner;
public class Lab5Challenge
{
	
	public void methodInLab5Challenge() {
		
	}

	public static void main(String[] args)
	{
		/*
		 * STARTING NEW PROGRAM Challenge # 1
		 */			
		System.out.println ("***CHALLENGE # 1*** \n");
	
		char userConsent;
		int a, input;

		do {
		
			Scanner sc= new Scanner (System.in);
			System.out.print("Do you want to run the program?");
			userConsent = sc.next(".").charAt(0);
		
		
			if(userConsent == 'Y' || userConsent == 'y')
			{
			break;
			}
			
		
		}
		while(userConsent != 'Y' || userConsent != 'y');
		
	
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a number 2 to 100 for timetable: ");
		input=sc.nextInt();
		
		
		while (input<2 || input>100)
		{
			System.out.print("Invalid number!!!Enter number again between 2 to 100 only:");
			input=sc.nextInt();
						
		}
			
		
		for (a=1; a<=12; a++)
			
		{
			System.out.println(a + " X " + input + " = " + (a*input) );
		}
		
		System.out.println("***END OF PROGRAM*** \n\n\n");

		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * "STARTING NEW PROGRAM Challenge # 2(a)
		 */		
		
		System.out.println ("***CHALLENGE # 2(a)***" + "\n");
		int b, c;		
			for (b=1; b<=5; b++)
		{		
				for (c=1; c<=b; c++)			
				System.out.print("*");		
				{
					System.out.println();
				}
		}
		System.out.println("END OF PROGRAM \n\n\n");

		
		
		
		
		
		/*
		 * "STARTING NEW PROGRAM Challenge # 2(b)
		 */		
		
		System.out.println ("***CHALLENGE # 2(b)*** \n");
		int d, e;		
			for (d=5; d>=1; d--)
		{		
				for (e=1; e<=d; e++)			
				System.out.print("*");		
				{
					System.out.println();
				}
		}
		System.out.println("END OF PROGRAM \n\n\n");

		
		
		
		

		
		/*
		 * "STARTING NEW PROGRAM Challenge # 2(c)
		 */		
		
		System.out.println ("***CHALLENGE # 2(c)*** \n");
		
		
		for(int i=0; i< 4; i++ )
		{
			
			if(i < 2)
			{
				for(int j=0; j < 3; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			else
			{
				for (int j=0; j<9; j++)
				{
					System.out.print("*");
				}
					System.out.println();							
			}
			
		}
			System.out.println("END OF PROGRAM");
					
		
	}

}
