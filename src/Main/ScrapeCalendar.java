package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ScrapeCalendar {

    GUIcore gc1 = new GUIcore();

    public ScrapeCalendar(WebDriver driver) throws InterruptedException, IOException {
        driver.manage().window().maximize();

        gc1.setLabel("Waiting for DUO verification...");

        //Give user time to authenticate with DUO
        Thread.sleep(10000);

        gc1.setLabel("Scraping Calendar...");

        Thread.sleep(8000);

        driver.get("https://kennesaw.view.usg.edu/d2l/le/calendar/6629");

        //creates list for calendar events
        List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='eventIds']/ul"));

        //finds all calendar events
        for (WebElement element : allElements) {

            //writes all calendar events to file
            try
            {
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("src/Files/ScrapeOutput"));
                bw.write(element.getText() + "\n");
                bw.close();
            } catch(Exception e) {
                return;
            }
        }
    }
}