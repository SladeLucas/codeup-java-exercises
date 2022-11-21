package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grade;
    public HashMap<String, String> attendance;

    public Student(String name){
        this.name=name;
        this.grade = new ArrayList<>();
        this.attendance = new HashMap<>();
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

    public void recordAttendance(String date, String value){
        attendance.put(date, value);
    }
    public double getAtt(){
        int pres = 0;
        int abs = 0;
        int total = attendance.size();
        for(String attVal : attendance.values()){
            if(attVal.equals("A")){
                abs++;
            }else if(attVal.equals("P")){
                pres++;
            }
        }

        double percent = ( ((double) total - (double)  abs)) / ((double) total);
        if (percent == -0.0){
            return percent = 0;
        } else if (percent == pres){
            return percent = 100;
        }
        return percent * 100;
    }

}
