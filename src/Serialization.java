// Serialization- the process of converting an object into a byte stream.
// a file with byte stream will be created (should end with .ser)


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Serialization {
    public static void main(String[] args) throws IOException {
        SerializationUser user = new SerializationUser();
        user.name = "nom";
        user.password = "789456";

        FileOutputStream fileOut = new FileOutputStream("files/SerializedFile.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved!");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: " + serialVersionUID);
    }
}
