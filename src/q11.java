import java.util.Scanner;

public class q11 {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter binary number: ");
//        int binary1 = input.nextInt();
//        System.out.println("Enter another binary number: ");
//        int binary2 = input.nextInt();
        int remainder = 0;
        int i = 0;
        int binary1 = 10;
        int binary2 = 11;
        int[] sum = new int[20];

        while (binary1 != 0 || binary2 != 0) {
            sum[i] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
        }

    }
}
