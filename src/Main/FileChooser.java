package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileChooser extends JPanel implements ActionListener {

    JButton go;

    JFileChooser chooser;
    String choosertitle;

    public FileChooser() {
        go = new JButton("Do it");
        go.addActionListener(this);
        add(go);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile(): " + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }
    }
    public Dimension getPrewferredSize(){
        return new Dimension(200,200);
    }
    public void OpenFileChooser(){
        JFrame frame = new JFrame(" ");
        JFileChooser panel = new JFileChooser();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.getContentPane().add(panel,"Center");
        frame.setSize(panel.getPreferredSize());
        frame.setVisible(true);
    }
}
