package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] arg) {
        boolean response = true;
        while(response){
            System.out.printf("What is the radius of your circle?%n");
            Circle circle = new Circle(6);


            System.out.printf("TWould you like to create another circle?%n");
            response = Input.yesNo("");
        };
        System.out.printf("Guess we will see you around.%n");
    }
}

