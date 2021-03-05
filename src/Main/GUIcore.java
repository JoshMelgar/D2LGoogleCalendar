package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUIcore implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static String user;
    private static String password;
    private static JPanel panel;
    private static JFrame frame;

    FileChooser f1 = new FileChooser();

    public static void GUIcore(){

        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Submit");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUIcore());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f1.OpenFileChooser();

        String user = userText.getText();
        String password = passwordText.getText();
        setUsername(user);
        setPassword(password);

        success.setText("Checking login information...");

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");

        WebDriver driver = new ChromeDriver(options);

        new Login(driver);

        success.setText("Logging in to D2L...");

        try {
            new ScrapeCalendar(driver);
            Sleep();
            success.setText("Copying calender events...");
            Sleep();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        success.setText("Finished!");
    }



    public void setUsername(String user){
        this.user = user;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUsername(){
        return user;
    }
    public String getPassword(){
        return password;
    }
    public void Sleep(){
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
