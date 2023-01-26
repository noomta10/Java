public class Parenthesis {
    public static void main(String[] args) {
        System.out.println(checkParenthesis("(((hello))"));
    }

    public static boolean checkParenthesis(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(')
                counter++;
            else {
                if (string.charAt(i) == ')')
                    if (counter > 0)
                        counter--;
                    else
                        return false;
            }
        }
        return counter == 0;
    }
}
