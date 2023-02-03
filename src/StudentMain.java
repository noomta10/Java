import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How want students do you want to enroll? ");
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enrollCourses();
            students[i].showTuition();
            students[i].payTuition();
            System.out.println("\n");
        }

        for (Student student : students){
            System.out.println(student + "\n");
        }
    }
}
