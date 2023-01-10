import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        SerializationUser user = new SerializationUser();
        user.name = "Yarden";
        user.password = "such0000";

        FileOutputStream fileOut = new FileOutputStream("files/SerializedFile.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved!");
    }
}
