// 91. Write a Java program to measure how long some code takes to execute in nanoseconds.

public class ExecutionTime {
    public static void main(String[] args) {
        long start = System.nanoTime();
        sumNumbers();
        long end = System.nanoTime();
        System.out.println("Execution time in nanoseconds: " + (end - start));
    }

    public static void sumNumbers() {
        int number = 0;
        for (int i = 0; i < 999999999; i++)
            number += i;
        System.out.println(number);
    }
}
