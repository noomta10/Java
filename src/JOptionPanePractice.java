// JOptionPane basic GUI

import javax.swing.*;

public class JOptionPanePractice {
    public static void main(String[] args) {
        // showMessageDialog
        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Message i", "Title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Message ?", "Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Message !", "Title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Message X", "Title", JOptionPane.ERROR_MESSAGE);

         // showConfirmDialog
        int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?");

        // showInputDialog
        String name = JOptionPane.showInputDialog("What is your name?: ");

        // showOptionDialog
        String[] responses = {"No, you are!","thank you!","*blush*"};
        int myAnswer = JOptionPane.showOptionDialog(
                null,
                "You are the best! :D",
                "Secret message",
                JOptionPane.DEFAULT_OPTION,
                0,
                null,
                responses,
                0);
        System.out.println(myAnswer);



    }
}