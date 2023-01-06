import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KeyBindingsPractice {
    JFrame frame;
    JLabel label;
    ImageIcon upIcon;
    ImageIcon downIcon;
    ImageIcon rightIcon;
    ImageIcon leftIcon;
    ImageIcon standIcon;
    Action upAction;
    Action downAction;
    Action rightAction;
    Action leftAction;

    KeyBindingsPractice() {
        frame = new JFrame("My Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.black);

        standIcon = new ImageIcon("pics/stand.png");
        upIcon = new ImageIcon("pics/up.png");
        downIcon = new ImageIcon("pics/down.png");
        rightIcon = new ImageIcon("pics/right.png");
        leftIcon = new ImageIcon("pics/left.png");

        label = new JLabel();
        label.setIcon(standIcon);
        label.setBounds(100, 100, 100, 100);

        upAction = new UpAction();
        downAction = new DownAction();
        rightAction = new RightAction();
        leftAction = new LeftAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setIcon(upIcon);
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setIcon(downIcon);
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setIcon(rightIcon);
            label.setLocation(label.getX() + 10, label.getY());
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setIcon(leftIcon);
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

}
