package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        GUIcore gc1 = new GUIcore();
        gc1.GUIcore();

        FileChooser f1 = new FileChooser();
        f1.OpenFileChooser();
    }
}