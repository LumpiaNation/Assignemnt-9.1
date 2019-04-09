//Luke Ugalino
//Abraham Martinez
//Benjamin Novakow
import java.util.Random;

public class Pin
{
    private int[] ranNumbers = new int [10];
    private int[] passEncrypt = new int [5];

    public Pin(String passWord)
    {

    }

private void encryptPass(String passWord)
{
    String[] passSplit = passWord.split("");

    for (int i = 0; i < passSplit.length; i++)
    {
        int indice = Integer.parseInt(passSplit[i]);
        passEncrypt[i] = ranNumbers[indice];
    }
}

private void newNumbers()
{
    Random randomNumber = new Random();

    for (int i = 0; i < ranNumbers.length; i++)
    {
        ranNumbers[i] = (int) ((randomNumber.nextFloat() * 3)+1);
    }
}

public void outRandomEntry()
{
    System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");
    System.out.println("NUM: ");

    for(int i = 0; i < (ranNumbers.length - 1); i++)
    {
        System.out.printf("%d ", ranNumbers[i]);
    }
    System.out.printf("%d\n", ranNumbers[ranNumbers.length - 1]);
}

public boolean verifyPass(String userInput)
{
    String[] splitUser = userInput.split("");

    if(splitUser.length !=5)
    {
        return false;
    }
    return true;
}
}


