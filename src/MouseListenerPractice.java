import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerPractice extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon dizzyIcon;
    ImageIcon happyIcon;
    ImageIcon punchIcon;
    ImageIcon suspiciousIcon;

    MouseListenerPractice(){
        dizzyIcon = new ImageIcon("pics/dizzy.png");
        happyIcon = new ImageIcon("pics/happy.png");
        punchIcon = new ImageIcon("pics/punch.png");
        suspiciousIcon = new ImageIcon("pics/suspicious.png");

        label = new JLabel();
        label.setBounds(200,170,100,100);
        label.setIcon(happyIcon);
        label.addMouseListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.add(label);
        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("hey!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(punchIcon);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(dizzyIcon);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(suspiciousIcon);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(happyIcon);
    }
}
