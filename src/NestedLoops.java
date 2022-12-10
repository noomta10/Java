import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        System.out.print("Enter character: ");
        String character = input.next();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++)
                System.out.print(character);
            System.out.println("");
        }
    }
}
