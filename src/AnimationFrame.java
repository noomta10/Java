import javax.swing.*;

public class AnimationFrame extends JFrame {

    AnimationPanel panel;

    AnimationFrame(){
        panel = new AnimationPanel();

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

}
