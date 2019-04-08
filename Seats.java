import java.util.Scanner;

public class Seating 
{
   public static char[][] seats={{ 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' },
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }};

   public static void main(String[] args) 
   {
   Scanner seatInput = new Scanner(System.in);
   String userChoice = "";
   int rowNumber=-1;
   int seatColumn=-1;

      while (!userChoice.equalsIgnoreCase("done") && seatsAvailable()) 
      {
      userInput();
      userChoice = seatInput.nextLine().trim();

         if (userChoice.length() == 2 && Character.isDigit(userChoice.charAt(0))
            && Character.isAlphabetic(userChoice.charAt(1))) {

         if (userChoice.charAt(0) > '7' || userChoice.charAt(0) < '1' || userChoice.charAt(1) < 'A'
            || userChoice.charAt(1) > 'D') {

         System.out.println("Invalid.");
         continue;
      }
       
      else 
      {
         rowNumber = userChoice.charAt(0) - 48;

         switch (userChoice.charAt(1)) 
         {
         case 'A':
         seatColumn=1;
         break;

         case 'B':
         seatColumn=2;
         break;
      
         case 'C':
         seatColumn=3;
         break;

         case 'D':
         seatColumn=4;
         break;
         }
      }

      if (seats[rowNumber-1][seatColumn-1] == 'X') 
      {
      System.out.println("Seat taken.");   
      } 
         else 
         {
         seats[rowNumber-1][seatColumn-1] = 'X';
         System.out.println("Booked " + userChoice);
         }
      }
   }   
}

   public static boolean seatsAvailable() 
   {
      for (char[] a : seats) 
      {
         for (char b : a) 
         {
            if (b != 'X') 
            {
               return true;
            }
         }
      }
         return false;
   }

   public static void userInput() 
   {
   System.out.println("Choose seat, to end type done");
   displaySeat();
   }

   public static void displaySeat() 
   {
   int i=1;

      for (char[] a : seats) 
      {
      System.out.print(i++ + " ");

         for (char b : a) 
         {
         System.out.print(b + " ");
         }
      System.out.println();
      }
   }
}
