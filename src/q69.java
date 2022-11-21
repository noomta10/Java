// 90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.

public class q69 {
    public static void main(String[] args) {
        System.out.println("Path: " + System.getenv("PATH"));
        System.out.println("Temp: " + System.getenv("TEMP"));
        System.out.println("Username: " + System.getenv("USERNAME"));
    }
}
