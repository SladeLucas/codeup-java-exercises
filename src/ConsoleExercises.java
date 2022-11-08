import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f%n", pi);


        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
