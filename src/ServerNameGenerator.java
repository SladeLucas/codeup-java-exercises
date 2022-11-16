import java.util.Random;

public class ServerNameGenerator {

    static String[] nouns = {"house", "Chicago", "Island", "Water", "Box", "Car", "Lamp", "Foot", "Licorice", "Laptop"};
    static String[] adjectives = {"floppy", "limp", "strange", "smelly", "confused", "content", "happy", "sad", "suspicious", "sleepy"};

    static Random randomIndex = new Random();

    public static String newName(String[] arr){
        int RanIn = randomIndex.nextInt(arr.length);

        return arr[RanIn];
    }
    public static void main(String[] arg) {
        //Here is your server name:
        //dedicated-photon
        System.out.printf("Here is your server name:%n%s-%s", newName(adjectives), newName(nouns));
    }
}
