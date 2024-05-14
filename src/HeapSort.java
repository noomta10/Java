import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {


    public static int[] get_input_from_file(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
            String line = bufferReader.readLine(); 

            if (line != null) {
                String[] numbersString = line.trim().split("\\s+");
                int[] numbers = new int[numbersString.length];
                
                for (int i = 0; i < numbersString.length; i++) {
                    numbers[i] = Integer.parseInt(numbersString[i]); 
                }

                System.out.println("Array created from the file:");
                for (int number : numbers) {
                    System.out.print(number + " ");
                }

            bufferReader.close();
            fileReader.close();
            return numbers;
                
            } else {
            System.out.println("File empty");
            System.exit(-1);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
            return null;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        int[] numbers = get_input_from_file(fileName);
        scanner.close();

    }
}
