import java.io.Serializable;

public class SerializationUser implements Serializable {
    String name;
    String password;

    void sayHello() {
        System.out.println("Hello " + name);
    }
}
