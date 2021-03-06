package Main;

import javax.swing.*;
import java.awt.*;

public class ProcessingGUI {

    private static JLabel passwordLabel;
    private static JLabel process;
    private static String user;
    private static JPanel panel;
    private static JFrame frame;

    public static void Processing(){

        panel = new JPanel();
        frame = new JFrame("Processing Window");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.getContentPane().setBackground(Color.BLACK);

        panel.setLayout(null);

        frame.setVisible(true);

    }
}
