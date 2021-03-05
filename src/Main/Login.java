package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {

    GUIcore gc1 = new GUIcore();

    public Login(WebDriver driver){
        driver.get("https://ksufed.kennesaw.edu/adfs/ls/?SAMLRequest=jdE9T8MwEAbgHYn%2fEHmP7TiN3VhJpQqWSmVpgYEFXZJrG5E4x" +
                "ee0%2fHxSqgpGtvvQKz26K5ZjOLgNfo5IIVo9loyg7%2fy1f893TaZBGdBVPmtUPZcpGI0K8jrRqQYWvaKndnAlU1yyaEU04spRABem" +
                "kVQyTmQs82clbTKzmeE6MZmS%2bRuLlkTow5R9GByNPfot%2blNb48tmXbJDCEeyQnygc0hw5qcWz3ykPcdmFI3qRHcUMNFFN%2bxbJ" +
                "y7o9aXi045FX33nqGSjd3YAask66JFsqO12%2bbS2k9Ue%2fRCGeujY4v4uioofuf9PEG5utrgp55nZpXljYkiNiWcSsjhXRsVZVekU" +
                "QQPskAd001WIV77dHwIdoUZeD%2f0vvRBXxAQqxN%2b3LL4B");

        //getting the username
        WebElement username = driver.findElement(By.id("userNameInput"));

        //getting the password
        WebElement password = driver.findElement(By.id("passwordInput"));

        //finding the submit button
        WebElement loginButton = driver.findElement(By.id("submitButton"));

        //user's user and password goes here
        username.sendKeys(gc1.getUsername());
        password.sendKeys(gc1.getPassword());
        loginButton.click();

        driver.switchTo().frame("duo_iframe");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='positive auth-button'][.='Send Me a Push ']"))).click();// instead of id u can use cssSelector or xpath of ur element.

        System.out.println("Waiting for DUO verification...");
    }
}