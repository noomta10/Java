public class Recursion5 {
    public static void main(String[] args){
        System.out.println(countCharacter("aca", 'a'));
    }

    public static int countCharacter(String string, Character character){
        if (string.length() == 0)
            return 0;
        if (string.charAt(0) == character)
            return 1 + countCharacter(string.substring(1), character);
        else
            return countCharacter(string.substring(1), character);
    }
}
