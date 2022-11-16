package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] arg){
        Movie[] thearr = MoviesArray.findAll();
        boolean again = true;
        while (again){
            System.out.printf("Choose your path...%n0 - exit%n1 - view all movies%n2 - view movies in the animated category%n3 - view movies in the drama category%n4 - view movies in the horror category%n5 - view movies in the scifi category%n6 - add a movie in one of the above categories%n");
        }
    }
}
