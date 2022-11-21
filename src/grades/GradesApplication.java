package grades;
import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] arg){
        HashMap<String, Student> students = new HashMap<>();
        //create four students
        Student steve = new Student("Steve");
        Student aaron = new Student("Aaron");
        Student kyle = new Student("Kyle");
        Student ben = new Student("Ben");

        //three grades each
        steve.addGrade(99);
        steve.addGrade(95);
        steve.addGrade(97);

        aaron.addGrade(76);
        aaron.addGrade(69);
        aaron.addGrade(72);

        kyle.addGrade(87);
        kyle.addGrade(83);
        kyle.addGrade(80);

        ben.addGrade(42);
        ben.addGrade(58);
        ben.addGrade(63);

        students.put("stevemcqueen", steve);
        students.put("igottwoAsonron", aaron);
        students.put("basicguy", kyle);
        students.put("badatschool", ben);

    }
}
