import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationUser user;

        FileInputStream fileIn = new FileInputStream("files/SerializedFile.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (SerializationUser) in.readObject();
        fileIn.close();
        in.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

    }
}

