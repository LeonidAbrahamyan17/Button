import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(600,600);
        jFrame.getContentPane().setLayout(null);
        // create button
        JButton jButton = new JButton();
        jButton.setText("Hello world");
        jButton.setSize(100,100);
        jButton.setLocation(100,100);
        //press button
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world");
            }
        };
        jButton.addActionListener(actionListener);
        jFrame.add(jButton);
    }
}