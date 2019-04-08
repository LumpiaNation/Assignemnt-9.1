
import java.util.Random;

public class Pin
{
    private int[] ranNumbers = new int [10];
    private int[] passEncrypt = new int [5];

    public Pin(String passWord)
    {

    }
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
    Random random = new Random();

    
}