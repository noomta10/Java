import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyNewFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyNewFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300,100));
        textField.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        textField.setBackground(new Color(255, 204, 204));
        textField.setForeground(new Color(255, 255, 204));
        textField.setCaretColor(new Color(204, 255, 242));

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("Hello " + textField.getText());
            button.setEnabled(false);
            textField.setEnabled(false);
        }
    }
}
