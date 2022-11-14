import java.util.Scanner;
import java.util.Random;

public class HighLow {

    public static int numGuess(int x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you guess what number I am thinking of?: Y/N");
        String answer = scanner.next();
        boolean play = answer.equalsIgnoreCase("y");
        do {
            Random theNumber = new Random(100);

        } while (play);
        return numGuess;
    }

    public static void main(String[] arg){

    }
}
