//Luke Ugalino
//Abraham Martinez
//Benjamin Novakow
import java.util.Scanner;
public class Seats 
{
   //Creating an array that shows and contains the letter of the seats.
   public static char[][] seats={{ 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' },
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }};

   public static void main(String[] args) 
   {
      //Variables and setting the row number and seat column lengths
   Scanner seatInput = new Scanner(System.in);
   String userChoice = "";
   int rowNumber=-1;
   int seatColumn=-1;

   //Loop that continues to take the users input and checks for if the input is valid or not valid
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
       //If the input is valid it records the users input
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
         // Check to see if the uesr input is already taken
      if (seats[rowNumber-1][seatColumn-1] == 'X') 
      {
      System.out.println("Seat taken.");   
      } 
      //Else it will book the seat by replacing it with X and outputting "Booked seat"
         else 
         {
         seats[rowNumber-1][seatColumn-1] = 'X';
         System.out.println("Booked " + userChoice);
         }
      }
   }   
}
   //Boolean to check if the seats are available

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

   //Following two methods display the array and ask the user to either enter a seat to book or to end the code
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
