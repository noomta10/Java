// 40. Write a Java program to list the available character sets in charset objects.

import java.nio.charset.Charset;

public class AvailableCharset {
    public static void main(String[] args) {
        for (String charset : Charset.availableCharsets().keySet())
            System.out.println(charset);
    }
}
