// 67. Write a Java program to insert a word in the middle of the another string.
// Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0

public class q47 {
    public static void main(String[] args){
        String sentence = "Python 3.0";
        String word = "Tutorial";
        System.out.println(sentence.substring(0, 7) + word + sentence.substring(6));
    }
}
