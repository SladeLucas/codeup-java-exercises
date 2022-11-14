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

    public static void main(String[] arg){
        System.out.println(numMath(2, 5));
        System.out.println(subMath(2, 5));
        System.out.println(mulMath(2, 5));
        System.out.println(divMath(6, 2));
    }
}
