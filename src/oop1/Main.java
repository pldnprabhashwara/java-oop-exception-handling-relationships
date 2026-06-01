package oop1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --- Get School details ---
        System.out.print("Enter school name     : ");
        String schoolName = sc.nextLine();

        System.out.print("Enter principal name  : ");
        String principalName = sc.nextLine();

        // --- Get Classroom details ---
        System.out.print("Enter room number     : ");
        int roomNumber = sc.nextInt();
        sc.nextLine(); // clear newline after nextInt()

        System.out.print("Enter grade           : ");
        String grade = sc.nextLine();

        System.out.print("Enter capacity        : ");
        int capacity = sc.nextInt();
        sc.nextLine();

        // --- Create School (Classroom built inside School) ---
        School school = new School(schoolName, principalName,
                roomNumber, grade, capacity);

        // --- Display school + classroom ---
        System.out.println();
        school.display();

        // --- isLargeRoom() check ---
        System.out.println("--- Room Size ---");
        if (school.getClassroom().isLargeRoom()) {
            System.out.println("  This is a LARGE room.");
        } else {
            System.out.println("  This is a standard size room.");
        }

        // --- Get event details for announcements ---
        System.out.println();
        sc.nextLine();
        System.out.print("Enter event name      : ");
        String eventName = sc.nextLine();

        System.out.print("Enter event date      : ");
        String eventDate = sc.nextLine();

        System.out.print("Enter audience grade  : ");
        String audienceGrade = sc.nextLine();

        // --- Call all 3 overloaded announceEvent() versions ---
        System.out.println();
        System.out.println("=== Announcement 1 (name only) ===");
        school.announceEvent(eventName);

        System.out.println("=== Announcement 2 (name + date) ===");
        school.announceEvent(eventName, eventDate);

        System.out.println("=== Announcement 3 (name + date + grade) ===");
        school.announceEvent(eventName, eventDate, audienceGrade);

        sc.close();
    }
}