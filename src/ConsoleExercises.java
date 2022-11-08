import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f%n", pi);


        System.out.print("Enter something: ");
        Integer userInput = scanner.nextInt();
//      Error happens when not int


        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //scanner.next();

        String oneWord;
        String twoWord;
        String threeWord;

        System.out.print("Enter a word, another word, and a third word");
        oneWord = scanner.next();
        twoWord = scanner.next();
        threeWord = scanner.next();

        System.out.println(oneWord);
        System.out.println(twoWord);
        System.out.println(threeWord);
// If more than three words are input the words after three will be ignored
        scanner.nextLine();
        System.out.println("enter a sentence: ");
        String sen = scanner.nextLine();
        System.out.println(sen);
        // Parimeter calc
        String length;
        String width;

        System.out.println("enter the size of your room LxW: ");
        length = scanner.nextLine();
        width = scanner.nextLine();

        int lengthInt = Integer.parseInt(length);
        int widthInt = Integer.parseInt(width);

        int area = (lengthInt * widthInt);
        int perimeter = ((lengthInt + widthInt) * 2);

        System.out.printf("the length was %s and the width %s. The area of your classroom is %d with the perimeter being %d", length, width, area, perimeter);

    }

}
