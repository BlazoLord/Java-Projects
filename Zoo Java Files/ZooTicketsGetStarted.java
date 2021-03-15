package zoo;

import java.util.*;
public class ZooTicketsGetStarted
{
   public static void main(String[] args)
   {
     	Scanner keyboard = new Scanner(System.in);

      System.out.print("Number of adults: ");
      int numberAdults = keyboard.nextInt();
      System.out.print("Number of children: ");
      int numberChildren = keyboard.nextInt();

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
}
