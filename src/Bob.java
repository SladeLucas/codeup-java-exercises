import java.util.Scanner;
public class Bob {
    public static void main(String[] arg){
        //Bob answers---
        //'Sure.' if you ask him a question. (the input ends with a question mark)
        //'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //'Whatever.' to anything else.
        Scanner boblistener = new Scanner(System.in);
        System.out.println("Did you have something to say to me? [Y/N]");
        String answer = boblistener.next();
        boolean bobTalk = answer.equalsIgnoreCase("y");
        boblistener.nextLine();
        if (bobTalk) {
            do {
                System.out.println("What?");
                String response = boblistener.nextLine();
                if (response.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (response.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (response.endsWith(" ") || response.equals("")) {
                    System.out.println("Fine. Be that way!");
                } else {
                    System.out.println("Whatever.");
                }
                System.out.println("Is that it? [Y/N]");
                answer = boblistener.next();
                bobTalk = answer.equalsIgnoreCase("n");
                boblistener.nextLine();
            } while (bobTalk);
        }
        }
    }

