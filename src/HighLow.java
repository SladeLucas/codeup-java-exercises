import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class HighLow {

    public static int numGuess(int x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you guess what number I am thinking of?: Y/N");
        String answer = scanner.next();
        boolean play = answer.equalsIgnoreCase("y");
        do {
            int min = 1;
            int max = 100;
            int theNumber = (int)(Math.random()*(max-min+1)+min);
            //System.out.println("the Number = " + theNumber);
            System.out.println("Guess a number between 1 and 100...");
            int guess = scanner.nextInt();
            System.out.println("guess = " + guess);
            while (guess != theNumber) {
                if (guess < theNumber) {
                    System.out.println("HIGHER");
                    System.out.println("Try again");
                    guess = scanner.nextInt();
                    System.out.println("guess = " + guess);
                } else if (guess > theNumber) {
                    System.out.println("LOWER");
                    System.out.println("Try again");
                    guess = scanner.nextInt();
                    System.out.println("guess = " + guess);
                }
            }
            if (guess == theNumber){
                System.out.println("GOOD GUESS");
            }
            System.out.println("shall we play again? Y/N");
            answer = scanner.next();
            play = answer.equalsIgnoreCase("y");
        } while (play);
        return x;
    }

    public static void main(String[] arg){
        numGuess(1);
    }
}
