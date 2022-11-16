package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] arg){
        Movie[] thearr = MoviesArray.findAll();
        boolean again = true;
        while (again){
            System.out.printf("Choose your path...%n0 - exit%n1 - view all movies%n2 - view movies in the animated category%n3 - view movies in the drama category%n4 - view movies in the horror category%n5 - view movies in the scifi category%n6 - add a movie in one of the above categories%n");
            int input = Input.getInt("Type choice here -> ");
            if (input == 0){
                System.out.printf("See ya next time!%n");
                System.exit(0);
            } else if (input == 1){
                System.out.printf("Enjoy the variety:%n");
                for (int i = 0; i < thearr.length; i++) {
                    System.out.printf("%s, %s%n", Movie.getterNam(thearr[i]), Movie.getterCat(thearr[i]));
                }
                System.out.printf("Would you like to go again?%n");
            } else if (input == 2){
                System.out.printf("The ones with animation:%n");
                for (int i = 0; i < thearr.length; i++) {
                    if (Movie.getterCat(thearr[i]).equalsIgnoreCase("animated")) {
                        System.out.printf("%s, %s%n", Movie.getterNam(thearr[i]), Movie.getterCat(thearr[i]));
                    }
                }
                System.out.printf("Would you like to go again?%n");
            } else if (input == 3){
                System.out.printf("Dramatic Movies:%n");
                for (int i = 0; i < thearr.length; i++) {
                    if (Movie.getterCat(thearr[i]).equalsIgnoreCase("drama")) {
                        System.out.printf("%s, %s%n", Movie.getterNam(thearr[i]), Movie.getterCat(thearr[i]));
                    }
                }
                System.out.printf("Would you like to go again?%n");
            } else if (input == 4){
                System.out.printf("The scary stuff:%n");
                for (int i = 0; i < thearr.length; i++) {
                    if (Movie.getterCat(thearr[i]).equalsIgnoreCase("horror")) {
                        System.out.printf("%s, %s%n", Movie.getterNam(thearr[i]), Movie.getterCat(thearr[i]));
                    }
                }
                System.out.printf("Would you like to go again?%n");
            } else if (input == 5){
                System.out.printf("Something to do with space:%n");
                for (int i = 0; i < thearr.length; i++) {
                    if (Movie.getterCat(thearr[i]).equalsIgnoreCase("scifi")) {
                        System.out.printf("%s, %s%n", Movie.getterNam(thearr[i]), Movie.getterCat(thearr[i]));
                    }
                }
                System.out.printf("Would you like to go again?%n");
            } else if (input == 6){
                System.out.printf("Start be adding a movie title...%n");
                String nameStorage = Input.getString("Start by adding a movie Title:");
                System.out.printf("Now add a category that fits the movie...%n");
                String categoryStorage = Input.getString("Now, lets add a category that best fits:");
                Movie umovie = new Movie(nameStorage, categoryStorage);
                thearr = Arrays.copyOf(thearr, thearr.length + 1);
                thearr[thearr.length-1] = umovie;
                System.out.printf("The movie %s was added as a %s movie%n", Movie.getterNam(umovie), Movie.getterCat(umovie));
                System.out.printf("Would you like to go again?%n");
            }
            again = Input.yesNo("Would you like to go again?");
        }
        System.out.printf("Thanks for coming%n");
    }
}
