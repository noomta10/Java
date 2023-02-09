public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static long factorial(int n){
        long result;
        if (n == 1)
            return 1;
        else
            result = n * factorial(n-1);
        return result;
    }
}


