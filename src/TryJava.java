import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryJava {
    public static void main(String[] arg) {
        try {
            FileReader reader = new FileReader("noam2.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
