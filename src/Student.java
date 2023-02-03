import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private static int id = 1000;
    private final String firstName;
    private final String lastName;
    private final int year;
    private String studentId;
    private final ArrayList<String> courses = new ArrayList<>();
    private int tuitionBalance = 0;
    final int costOfCourse = 500;

    // Constructor
    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("""
                Enter year:
                1. Freshman
                2. Sophomore
                3. Junior
                4. Senior""");
        this.year = scanner.nextInt();
        setID();
    }

    // Generate id
    private void setID() {
        id++;
        this.studentId = this.year + "" + id;
    }

    //Enroll in courses
    public void enrollCourses() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course to enroll (Q to quit): ");
        String course = scanner.nextLine();
        while (!course.equals("Q")) {
            courses.add(course);
            tuitionBalance += costOfCourse;
            System.out.print("Enter course to enroll (Q to quit): ");
            course = scanner.nextLine();
        }
    }

    // View balance
    public void showTuition() {
        System.out.println("Your tuition balance is $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much would you like to pay? ");
        int payment = scanner.nextInt();
        System.out.println("Thank you for your payment of $" + payment);
        tuitionBalance -= payment;
        showTuition();
    }

    // Show status
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "\n" +
                "Student ID: " + this.studentId + "\n" +
                "Courses: " + Arrays.toString(courses.toArray())
                .replace("[", "").replace("]", "") + "\n" +
                "Tuition balance: $" + this.tuitionBalance;
    }

}
