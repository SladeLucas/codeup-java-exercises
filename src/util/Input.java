package util;
import java.util.Scanner;
public class Input {
    private static Scanner pscanner = new Scanner(System.in);

    public static String getString(){
        String retstring = pscanner.nextLine();
        return retstring;
    }
    //The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public static boolean yesNo(){
        String input = pscanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        }else {
            return false;
        }
    }
    public static int getInt(int min, int max){

    }
    public static int getInt(){

    }
    public static double getDouble(double min, double max){

    }
    public static double getDouble(){

    }
}
