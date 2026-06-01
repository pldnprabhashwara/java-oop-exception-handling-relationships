package oop10;

public class GradeEntry {
    public void validateEntry(int id, double marks)
        throws InvalidStudentIdException, InvalidMarksException {

        if(id <= 0){
            throw new InvalidStudentIdException("Student ID must be positive");
        }

        if(marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
    }

}