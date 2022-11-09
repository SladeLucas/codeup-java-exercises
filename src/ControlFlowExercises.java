import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] arg) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        int num = 100;
//        do {
//           System.out.print(num + " ");
//           num-=5;
//        } while (num >= -10);

//        int x = 2;
//        System.out.println(x);
//        do {
//            x = (int) Math.pow(x, 2);
//            System.out.println(x);
//        } while (x < 65536);
//Refactor to For loop
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        for (int i = 2; i < 65535; ) {
//            i = (int) Math.pow(i, 2);
//            System.out.println(i);
//            }
//        }
// FIZZBUZZ FUN
//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 15 == 0){
//                System.out.println("Fizzbuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.print(i + " ");
//            }
//        }

        Scanner conScan = new Scanner(System.in);

            System.out.println("Drop a number, respectfully: ");
            int urNum = conScan.nextInt();

            System.out.println("Here is a table...");
            System.out.println("number | Squared | cubed");

            for (int i = 1; i <= urNum; i++){
                int square = i * i;
                int cube = i * i * i;
                System.out.printf("%d     | %d      | %d    %n", i, square, cube);
                System.out.println("Shall we continue, y/n?");
                String answer = conScan.next();
                boolean uAnswer = answer.equalsIgnoreCase("y");
                if (!uAnswer){
                    break;
                }
            }

    }
}
