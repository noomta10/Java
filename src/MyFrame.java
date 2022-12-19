import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon clickIcon = new ImageIcon(new ImageIcon("click.png").getImage().
                         getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        ImageIcon emojiIcon = new ImageIcon(new ImageIcon("emoji.png").getImage().
                         getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        label = new JLabel();
        label.setIcon(emojiIcon);
        label.setBounds(250,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 200, 100);
        button.addActionListener(this);
        button.setText("Click me");
        button.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
        button.setForeground(new Color(71, 100, 116));
        button.setFocusable(false);
        button.setBackground(new Color(173, 188, 225));
        button.setIcon(clickIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setBorder(BorderFactory.createRaisedBevelBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hola");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
