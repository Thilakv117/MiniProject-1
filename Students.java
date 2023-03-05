import java.util.Random;
import java.util.Scanner;

class Students extends GuessWord
{
    int i;
    int j;
    String Name;
    String GuessWord;
    public void GetGuess()
    {
        Scanner sc = new Scanner(System.in);
        Random obj1 = new Random();
        Random obj2 = new Random();
        int ran1 = obj1.nextInt(4);
        int ran2 = obj2.nextInt(4);
        GuessWord obj = new GuessWord();
        String[][] GuessWord = obj.GetArray();
        System.out.print("Guess The Name: ");
         Name = sc.nextLine();

        for( i = 0; i<GuessWord.length;i++)
        {
            for( j =i; j<=GuessWord.length;j++)
            {

                }
            }
        if(GuessWord[i-1][j-1] == Name)
        {
            System.out.println("The Name Is Correct");
        }
        else
        {
            System.out.println("The Name Is Wrong");
        }
        System.out.println(ran1 + " " + ran2);
    }
}