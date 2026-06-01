package oop6;

public class GradeCalculator {
    public String computerGrade(Student s){
        if(s == null) return "Invalid Student";
        return computeGrade(s.getMarks(), false);
    }

    String computeGrade(double marks) {
        return computeGrade(marks, false);
    }

    public String computeGrade(double marks, boolean isMedStudent) {
        if (marks >= 75) {
            return "A";
        }
        if (isMedStudent) {
            if (marks >= 65) return "B";
        } else {
            if (marks >= 60) return "B";
        }
        if (marks >= 50) return "C";
        return "F";
    }
}
