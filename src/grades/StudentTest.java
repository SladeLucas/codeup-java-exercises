package grades;

public class StudentTest {
    public static void main(String[] arg){
        Student John = new Student("John C");

        John.addGrade(88);
        John.addGrade(34);
        John.addGrade(67);

        System.out.println("John's grade average = " + John.getGradeAverage());
    }
}
