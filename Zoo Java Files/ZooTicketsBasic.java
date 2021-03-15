package zoo;

import java.util.*;
public class ZooTicketsBasic
{
	private static Scanner keyboard = new Scanner(System.in);

	// Serve tickets until the user wants to exit the program
	//
   public static void main(String[] args) throws Exception
   {
      while(true)
      {
			serveTicketsForOneGroup();

			if (exitProgram())
			{
				System.out.println("\nThank You!");
				break;		// to exit the while loop
			}
		}
   }

	// serve tickets for one group
	//
   public static void serveTicketsForOneGroup() throws Exception
   {
		System.out.print("Number of adults: ");
		String temp = keyboard.next();
		keyboard.nextLine();
		int numberAdults = Integer.parseInt(temp.trim());

		System.out.print("Number of children: ");
		temp = keyboard.next();
		keyboard.nextLine();
		int numberChildren = Integer.parseInt(temp.trim());

		int familyTickets = (int) Math.min(numberAdults/2, numberChildren/2);

		int childTickets = numberChildren - 2 * familyTickets;
		int adultTickets = numberAdults - 2 * familyTickets;

		int cost = familyTickets * 26 + adultTickets * 10 + childTickets * 5;

		System.out.println();
		if (familyTickets > 0)
		{
			System.out.println("Number of family tickets: " + familyTickets);
		}
		if (adultTickets > 0)
		{
			System.out.println("Number of adult tickets: " + adultTickets);
		}
		if (childTickets > 0)
		{
			System.out.println("Number of child tickets: " + childTickets);
		}
		System.out.println("Total cost: $" + cost);
	}

	// Returns true if the user wants to exit th program
	// and false otherwise
	//
	public static boolean exitProgram()
	{
		System.out.println("\nTo continue press the Enter key");
		System.out.println("To exit program, type EXIT (in upper case)");
		String response = keyboard.nextLine().trim();
		return response.equals("EXIT");
	}
}
/*
Number of adults: 3
Number of children: 3

Number of family tickets: 1
Number of adult tickets: 1
Number of child tickets: 1
Total cost: $41

To continue press the Enter key
To exit program, type EXIT (in upper case)

Number of adults: -3
Number of children: 3
ERROR: Invalid input values!

To continue press the Enter key
To exit program, type EXIT (in upper case)

Number of adults: 3
Number of children: -3
ERROR: Invalid input values!

To continue press the Enter key
To exit program, type EXIT (in upper case)

Number of adults: -3
Number of children: -3
ERROR: Invalid input values!

To continue press the Enter key
To exit program, type EXIT (in upper case)

Number of adults: 3
Number of children: abc
Incorrect data format for integers!
Thrown exception: java.lang.NumberFormatException: For input string: "abc"

To continue press the Enter key
To exit program, type EXIT (in upper case)

Number of adults: abc
Incorrect data format for integers!
Thrown exception: java.lang.NumberFormatException: For input string: "abc"

To continue press the Enter key
To exit program, type EXIT (in upper case)

Number of adults: 3
Number of children: 3

Number of family tickets: 1
Number of adult tickets: 1
Number of child tickets: 1
Total cost: $41

To continue press the Enter key
To exit program, type EXIT (in upper case)
EXIT

Thank You!
*/
