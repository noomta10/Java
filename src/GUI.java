import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI {
    public static void main(String[] args){
        ImageIcon image = new ImageIcon("pics/programmer.png");
        Border border = BorderFactory.createLineBorder(new Color(152, 134, 103), 5);

        JLabel label = new JLabel();
        label.setText("Sis, can you even </code>?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 60));
        label.setForeground(new Color(161, 194, 130));
        label.setIconTextGap(20);
        label.setBackground(new Color(210, 236, 236));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setSize(800,800);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}