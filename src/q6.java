import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        for (int i = 0; i < 10; i++){
            int result = number * (i + 1);
            System.out.println(number + "*" + (i+1) + "=" + result);
        }
    }
}
