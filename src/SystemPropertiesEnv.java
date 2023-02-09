// 88. Write a Java program to get the current system environment and system properties.

public class SystemPropertiesEnv {
    public static void main(String[] args) {
        System.out.println("Current system properties: \n" + System.getProperties());
        System.out.println("Current system environment: \n" + System.getenv());
    }
}
