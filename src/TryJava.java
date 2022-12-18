import javax.swing.*;
import java.awt.*;

public class TryJava {
    public static void main(String[] arg) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700,700);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("img.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.CYAN);

    }
}
