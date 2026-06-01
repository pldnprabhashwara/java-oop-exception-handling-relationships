package oop1;

public class School {
    private String schoolName;
    private String principleName;

    private Classroom classroom;

    public School(String schoolName, String principleName, int roomNumber, String grade, int capacity) {
        this.schoolName = schoolName;
        this.principleName = principleName;

        this.classroom = new Classroom(roomNumber, grade, capacity);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public Classroom getClassroom(){
        return classroom;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    public void display(){
        System.out.println("-------------School Details--------------");
        System.out.println("School Name: " + schoolName);
        System.out.println("Principle Name: " + principleName);
        System.out.println("-------------Classroom Details------------");
        classroom.display();
    }

    public void announceEvent(String eventName) {
        System.out.println("[ANNOUNCEMENT] Event  : " + eventName);
    }

    // Version 2: event name + date
    public void announceEvent(String eventName, String eventDate) {
        System.out.println("[ANNOUNCEMENT] Event  : " + eventName);
        System.out.println("               Date   : " + eventDate);
    }

    // Version 3: event name + date + audience grade
    public void announceEvent(String eventName, String eventDate,
                              String audienceGrade) {
        System.out.println("[ANNOUNCEMENT] Event  : " + eventName);
        System.out.println("               Date   : " + eventDate);
        System.out.println("               Grade  : " + audienceGrade);
    }
}
