import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    Scanner scanner = new Scanner(System.in);
    public static int numMath(int x,int y){
        return x + y;
    }
    public static int subMath(int a,int b){
        return a - b;
    }
    public static int mulMath(int x, int y){
        return x * y;
    }
    public static int divMath(int x, int y){
        return x/y;
    }
    public static int modMath(int x, int y){
        return x%y;
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d:%n", min, max);
           int usernum = scanner.nextInt();
           boolean intrange = (usernum <= max && usernum >= min);
           while (!intrange) {
               System.out.printf("Unacceptable. Please input a number between %d and %d%n", min, max);
               usernum = scanner.nextInt();
               intrange = (usernum <= max && usernum >= min);
           }
               System.out.printf("Your number is acceptable. I wanted a number between %d and %d, and your number was %d%n", min, max, usernum);

           return usernum;

    }

    public static int getInteger(int min, int max, int userinput) {
        Scanner scanner = new Scanner(System.in);
        if (userinput < min && userinput > max) {
            System.out.printf("Error! Enter a number between %d and %d:%n", min, max);
            userinput = scanner.nextInt();
        }
        return userinput;
    }
// the factNum was fun
    public static int factNum(int userNum){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a factorial? (Y/N)");
        String answer = scanner.next();
        boolean again = answer.equalsIgnoreCase("y");
        if (again) {
            do {
            System.out.println("Enter an Integer from 1-10 ...");
            userNum = scanner.nextInt();
            if (userNum <= 10 && userNum > 0) {
                int fact = 1;
                int number = userNum;
                for (int i = 1; i <= number; i++) {
                    fact = fact*i;
                }
                System.out.println("Factorial of " + number + " is: " + fact);
                System.out.println("Would you like to do a different number? Y/N");
                answer = scanner.next();
                again = answer.equalsIgnoreCase("y");
            }
            }while (again);
        }
      return userNum;
    }
    public static int diceGame (int x, int y) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides are on one of your die?");
        int sides = scanner.nextInt();
        System.out.println("Roll the dice? Y/N");
        String answer = scanner.next();
        boolean again = answer.equalsIgnoreCase("y");
        Random randomNumber = new Random();
        if (again) {
            do {
                for (int i = 0; i < 1; i++) {
                    System.out.print("you rolled: ");
                    System.out.print(randomNumber.nextInt(sides)+1);
                    System.out.print(", and ");
                    System.out.print(randomNumber.nextInt(sides)+1);
                    System.out.println("!");
                }
                System.out.println("Would you like to do a different number? Y/N");
                answer = scanner.next();
                again = answer.equalsIgnoreCase("y");
            } while (again);

        }
        return sides;
    }

    public static void main(String[] arg){
        System.out.println(numMath(2, 5));
        System.out.println(subMath(2, 5));
        System.out.println(mulMath(2, 5));
        System.out.println(divMath(6, 2));
        //the 0 resulted in an error
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        factNum(1);
        diceGame(2, 4);
    }
}
