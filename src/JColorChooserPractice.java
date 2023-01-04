import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserPractice extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    JColorChooserPractice(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setText("Some text to test colors :)");
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.BOLD, 50));

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Colors", Color.black);
            label.setForeground(color);
        }
    }
}
