package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public Student(String name){
        this.name=name;
        this.grade = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int x) {
        grade.add(x);
    }

    public double getGradeAverage(){
        double avg = 0;
        for (int x : grade){
            avg += x;
        }
        return avg / grade.size();
    }

}
