import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxPractice extends JFrame implements ActionListener {

    JComboBox<String> comboBox;

    JComboBoxPractice() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "unicorn"};
        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);

        /* Useful methods:
        comboBox.setEditable(true);
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        comboBox.removeAllItems();
        */

        this.add(comboBox);
        this.setVisible(true);
        this.pack();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}