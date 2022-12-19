import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(new ImageIcon("world.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        JLabel label = new JLabel();
        label.setText("Hello world!");
        label.setIcon(icon);
        label.setBounds(50, 50, 200, 100);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(163, 205, 184));
        greenPanel.setBounds(0, 0, 250, 250);
        greenPanel.setLayout(null);

        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(new Color(225, 201, 173));
        pinkPanel.setBounds(0, 250, 250, 250);
        pinkPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(greenPanel);
        frame.add(pinkPanel);
    }
}

