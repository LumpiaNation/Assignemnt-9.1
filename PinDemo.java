//Luke Ugalino
//Abraham Martinez
//Benjamin Novakow
import java.util.Scanner;
public class PinDemo
{
    //Password is 12345
    private static String testPassword = "12345";

    public static void main(String[] args)
    {
        //Main takes the users input and runs it in the Pin script
        //if the password is correct then it displays it matches the pin.
        Scanner keyboard = new Scanner(System.in);
        Pin newPin = new Pin(testPassword);

        newPin.outRandomEntry();

        String userPin = keyboard.nextLine();

        if(newPin.verifyPass(userPin))
        {
            System.out.println("The input matches the PIN.");
        }
        else
        {
            System.out.println("The input is incorrect.");
        }
        keyboard.close();
    }
}