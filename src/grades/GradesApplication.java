package grades;
import util.Input;
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

        steve.recordAttendance("2022-11-15", "P");
        steve.recordAttendance("2022-11-16", "A");
        steve.recordAttendance("2022-11-17", "P");

        aaron.recordAttendance("2022-11-15", "A");
        aaron.recordAttendance("2022-11-16", "A");
        aaron.recordAttendance("2022-11-17", "P");

        kyle.recordAttendance("2022-11-15", "A");
        kyle.recordAttendance("2022-11-16", "A");
        kyle.recordAttendance("2022-11-17", "P");

        ben.recordAttendance("2022-11-15", "A");
        ben.recordAttendance("2022-11-16", "A");
        ben.recordAttendance("2022-11-17", "A");
        System.out.println("ben.getAtt() = " + steve.getAtt());

        boolean gradebook = true;
        String name;
        double gradeave = 0;

        while(gradebook) {

            System.out.printf("This is the Grade Book, here you will access grades for:%n");
            for(String username : students.keySet()) {
                System.out.printf("%s%n", username);
            }
            System.out.printf("%n");
            System.out.println("Please choose a user");
            String userSearch = Input.getString("Select a user");

            while(students.get(userSearch) == null){
                System.out.println("User Not Found");
            }

            System.out.printf("Opening %s's grades...%n", userSearch);
            name = students.get(userSearch).getName();
            gradeave = students.get(userSearch).getGradeAverage();
            System.out.printf("%s: Name: %s Grade Average: %f%n", userSearch, name, gradeave);
            System.out.println("Would you like to check another student? (Y/N)");
            gradebook = Input.yesNo("s");
        }
        System.out.println("Goodbye.");
    }
}
