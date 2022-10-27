// 45. Write a Java program to find the size of a specified file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class q25 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter path: ");
        Path path = Path.of(input.nextLine());
        long fileSize = Files.size(path);
        System.out.println("size of file: " + fileSize);
    }
}
