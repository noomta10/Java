// 47. Write a Java program to display the current date time in specific format: "Now: 2017/06/16 08:52:03.066".

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatTime {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + formatter.format(now));
    }
}
