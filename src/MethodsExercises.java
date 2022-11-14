import java.util.Scanner;

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
           boolean intinrange = (usernum <= max && usernum >= min);
           while (!intinrange) {
               System.out.printf("Unacceptable. Please input a number between %d and %d%n", min, max);
               usernum = scanner.nextInt();
               intinrange = (usernum <= max && usernum >= min);
           }
               System.out.printf("Your number is acceptable. I wanted a number between %d and %d, and your number was %d", min, max, usernum);

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

    public static void main(String[] arg){
        System.out.println(numMath(2, 5));
        System.out.println(subMath(2, 5));
        System.out.println(mulMath(2, 5));
        System.out.println(divMath(6, 2));
        //the 0 resulted in an error
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
    }
}
