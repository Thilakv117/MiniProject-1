import java.util.Scanner;
import java.util.Random;
class Main
{
    public static void main(String[] args)
    {
       Students obj3 = new Students();
       do {
           obj3.GetGuess();
       }while(obj3.Name != obj3.GuessWord);

    }
}