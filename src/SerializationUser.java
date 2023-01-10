import java.io.Serial;
import java.io.Serializable;

public class SerializationUser implements Serializable {
    @Serial
    private static final long serialVersionUID = 123;

    String name;
    transient String password;

    void sayHello() {
        System.out.println("Hello " + name);
    }
}
